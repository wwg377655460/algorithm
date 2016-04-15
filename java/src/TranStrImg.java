import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;

/**
 * Created by wsdevotion on 16/4/15.
 */
//图片与字符的转换
public class TranStrImg {

    public static void main(String [] args) {
        tranStrImg("你好", 200, 100, "jpeg", Color.black);
    }

    public static void tranStrImg(String str, int width, int height, String Type, Color color) {
        //创建一张图片
        BufferedImage image = new BufferedImage(150,30,BufferedImage.TYPE_INT_RGB);
        //得到图片
        Graphics2D g = (Graphics2D)image.getGraphics();
        g.fillRect(0, 0, width, height);
        //向图片上写写数据
        g.setColor(color);//设置图片颜色
        g.setFont(new Font("隶书",Font.ITALIC,20));
        //把想要写的字符串画在图片上
        g.drawString(str, 10, 25);//画图片
        try {
            ImageIO.write(image, Type, new File(str + "." + Type));//保存成图片
        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
