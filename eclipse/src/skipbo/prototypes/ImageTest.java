package skipbo.prototypes;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

public class ImageTest {
 public static void main(String[] args) {
	 ClassLoader classLoader = Thread.currentThread().getContextClassLoader();
	 InputStream input = classLoader.getResourceAsStream("1.png");

	 try {
		 BufferedImage image = ImageIO.read(input);
		 System.out.println("Bild gelesen"+image);
	 } catch (IOException e) {
	     e.printStackTrace();
	 }
	 catch (Exception e)
	 {
		 System.out.println("andere Exception");
	 }
 } 
}
