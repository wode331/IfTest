import javax.swing.*;
import java.awt.*;

/**
 * @author 享学课堂-SaiLing老师
 * @老师qq:2408524688
 */
public class Demo2 extends JFrame {
    public static void main(String[] args) {
        Demo2 window = new Demo2();
        window.setVisible(true);
        window.setSize(1200,652);
        while (true){
            window.repaint();
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    int a = 150;
    public void paint(Graphics g){
        Image backImage = new ImageIcon("E:/images/bg.png").getImage();
        g.drawImage(backImage,0,0,null);
        Image jeck = new ImageIcon("E:/images/right/1.png").getImage();
        g.drawImage(jeck,a,230,null);
        a = a+20;
    }
}
