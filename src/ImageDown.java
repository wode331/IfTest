
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 摄图网: https://699pic.com/tupian/so.html
 */
public class ImageDown {

    //存储分离出来的图片url路径
    static ArrayList<String> urls = new ArrayList<>();
    //启动程序
    public static void main(String[] args) {
        ImageDown is= new ImageDown();
        is.getImages();
        is.downLoad(urls);
    }
    //抓取网络数据
    public void getImages(){
        URL url = null;
        BufferedInputStream bis =null;
        StringBuilder sb=  new StringBuilder();
        try {
            //输入网络网址
            url = new URL("https://699pic.com/tupian/so.html");//摄图网: https://699pic.com/tupian/so.html
            URLConnection conn = url.openConnection();
            //请求网站资源的方式,模拟浏览访问方式
            conn.setRequestProperty("User-Agent","Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:87.0) Gecko/20100101 Firefox/87.0");
            InputStream in = conn.getInputStream();
            bis = new BufferedInputStream(in);
            byte[]b = new byte[1024];
            int len = 0;
            while((len=bis.read(b)) != -1){
                String s =new String(b,0,len);
                System.out.println(s);
                sb.append(s);
            }
        } catch (MalformedURLException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally {
            try {
                bis.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
//从网页数据中分离出图片的资源url路径
            //匹配所有图片的路径
            String regex = "//img[\\w+\\.*\\w*/]+\\.jpg";//匹配   https://699pic.com/tupian/so.html
//            String regex = "//pic1[\\w+\\.*\\w*/]+\\.jpg";//匹配王者荣耀皮肤   http://www.win4000.com/hj/wangzherongyao.html
            Pattern p = Pattern.compile(regex);
            Matcher m  =p.matcher(sb.toString());

            while(m.find()){
                System.out.println(m.group());
                String path = m.group();
                urls.add(path);
            }

    }

    //把硬盘中下载的图片建立索引存储
    ArrayList<String> indexs= new ArrayList<>();
    //下载图片到硬盘中
    public void downLoad(ArrayList<String> urls){

        URL imagePath = null;
        FileOutputStream out =null;
        InputStream inputStream =null;
        //根据url下载网络图片
        for (int i = 0; i <urls.size() ; i++) {
            String path = urls.get(i);
            System.out.println("路径:"+path);
            //读取网络上的资源
            try {
                imagePath = new URL("http:"+path);

                byte[] by = new byte[1024];
                int len = 0;
                //存储路径
                File f = new File("E:/files/");
                if(!f.exists()){
                    f.mkdir();
                }
                String savePath = f.getAbsolutePath()+path.substring(path.lastIndexOf("/"));
                indexs.add(savePath);
                out = new FileOutputStream(savePath);
                System.out.println("savePath---"+savePath);

                inputStream = imagePath.openStream();
                while((len=inputStream.read(by)) != -1){
                    out.write(by,0,len);
                    out.flush();
                }
            }catch (IOException e) {
                e.printStackTrace();
                continue;//出现异常(网络资源读取不了)的时候跳过本次循环,继续下一个url地址
            }
        }
    }
}
