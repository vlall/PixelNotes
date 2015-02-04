import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;
import java.io.FileWriter;
import java.math.*;

public class PixelNotes extends Component {

  public static void main(String[] foo) {
    new image();
  }

  public void printPixelARGB(int pixel) {
  	/* Basic method of dividing colors, this is intended as ONLY a starting point.
  	    it might be helpful to create a wide array of categories, seperating this class to another file
  	*/
    int alpha = (pixel >> 24) & 0xff;
    int red = (pixel >> 16) & 0xff;
    int green = (pixel >> 8) & 0xff;
    int blue = (pixel) & 0xff;
    float red3 = red / 127;
    float green3 = green / 127;
    float blue3 = blue / 127;
    int red2 = Math.round(red3);
    int green2 = Math.round(green3);
    int blue2 = Math.round(blue3);
    
    
    int note = 0;
    System.out.println("rgb: " + red + ", " + green + ", " + blue);

/* *READ* This is a basic color test to make sure each color can recieve a unique value.
                     

    if (red2 == 0 && green2 == 0 && blue2 == 0) 
        {note = 1;} 
    
    else if (red2 == 1 && green2 == 0 && blue2 == 0) 
    	{note = 3;}
  
    else {note = 5;}
    System.out.println(note);	
    
 END COLOR COMPOSITION */

	try
        {
            String filename= "image.txt";
            FileWriter fw = new FileWriter(filename,true); //the true will append the new data
            fw.write(note+"\n");//appends the string to the file
            fw.close();
        }
        catch(IOException ioe)
        {
            System.err.println("IOException: " + ioe.getMessage());
        }

    //
  }

  private void marchThroughImage(BufferedImage image) {
    int w = image.getWidth();
    int h = image.getHeight();
    int counter = 25;

    System.out.println("width, height: " + w + ", " + h);

    for (int i = 0; i < h; i=i+counter) {
      for (int j = 0; j < w; j=j+counter) {
        System.out.println("x,y: " + j + ", " + i);
        int pixel = image.getRGB(j, i);
        printPixelARGB(pixel);
        System.out.println("");
      }
    }
  }

  public image() {
    try {
      // get the BufferedImage, using the ImageIO class
      BufferedImage image = 
        ImageIO.read(this.getClass().getResource("monalisa.jpg"));
      marchThroughImage(image);
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }

}
