import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

import javax.swing.*;
import java.awt.*;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * @author 享学课堂-SaiLing老师
 * @老师qq:2408524688
 * 通过学习这个案例:
 * 我们可以掌握动画的原理/java中多媒体的使用/电脑游戏的开发设计思想
 * 了解吃鸡游戏,王者荣耀等等背后的设计逻辑
 */
public class Jackson extends JFrame{  //带上窗口(JFrame)那么我也有了创建窗口的功能

    public static void main(String[] args) throws IOException, InterruptedException {
        //启动程序:需要有一个窗口,那就创建一个窗口
        Jackson j = new Jackson();   //这里刚接触java的同学不一定看得懂,你只要知道这里是创建窗口的动作
        j.setBounds(400,50,1200,652);
        j.setTitle("杰克逊太空步");
        j.setDefaultCloseOperation(3);
        j.setVisible(true);

        //放音乐--------------------------
      
        //加载硬盘中的音频文件
        FileInputStream file = new FileInputStream("E:\\images\\music.wav");
        //注意: 在jdk1.8版本中可以使用java.sun.audio这个包,之后的版本把这个包去掉了
		
		//把音频文件转成媒体流
        AudioStream as=new AudioStream(file);
        //媒体播放: 开始播放
        AudioPlayer.player.start(as);


        //刷新窗口------------------------------
        while (true){
            Thread.sleep(100);
            j.repaint();
        }
    }
    int x = 0;
    int i = 1;
    int n = 10;
    String img = "E:\\images\\right\\";

    //往窗口中绘图
    public void paint(Graphics g){
        Image backImage = new ImageIcon("E:\\images\\bg.png").getImage();
        g.drawImage(backImage,0,0,null);
        //杰克逊出场
        Image jeckson = new ImageIcon(img+i++ +".png").getImage();
        g.drawImage(jeckson,x,230,null);
        System.out.println("x="+x);
        x +=n;
        if(i==11){
            i=1;
        }
        if(x>=965){
            n = -n;
            img ="E:\\images\\left\\";
        }
        if(x<=0){
            n = -n;
            img ="E:\\images\\right\\";
        }
    }

}
