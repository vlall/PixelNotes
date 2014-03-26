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

//This is a test to make sure each color can recieve a unique value.
// You can and should edit this part out for compositional purposes                        

    if (red2 == 0 && green2 == 0 && blue2 == 0) 
        {note = 1;} 
    
    else if (red2 == 1 && green2 == 0 && blue2 == 0) 
    	{note = 3;}
    
    else if (red2 == 2 && green2 == 0 && blue2 == 0) 
		{note = 5;}
    
    else if (red2 == 0 && green2 == 1 && blue2 == 0) 
		{note = 6;} 
    
    else if (red2 == 0 && green2 == 2 && blue2 == 0) 
		{note = 8;} 
    
    else if (red2 == 0 && green2 == 0 && blue2 == 1) 
		{note = 6;} 
    
    else if (red2 == 0 && green2 == 0 && blue2 == 2) 
		{note = 10;} 
    
    else if (red2 == 0 && green2 == 1 && blue2 == 0) 
		{note = 8;} 
    
    else if (red2 == 1 && green2 == 1 && blue2 == 0) 
		{note = 9;} 
    
    else if (red2 == 2 && green2 == 1 && blue2 == 0) 
		{note = 10;} 
    
    else if (red2 == 0 && green2 == 1 && blue2 == 1) 
		{note = 1;} 
    
    else if (red2 == 0 && green2 == 1 && blue2 == 2) 
		{note = 12;} 
    
    else if (red2 == 1 && green2 == 1 && blue2 == 1) 
		{note = 13;} 
    
    else if (red2 == 2 && green2 == 2 && blue2 == 2) 
		{note = 3;} 
    
    else if (red2 == 2 && green2 == 2 && blue2 == 1) 
		{note = 5;} 

    else if (red2 == 2 && green2 == 2 && blue2 == 0) 
		{note = 6;} 
    
    else if (red2 == 2 && green2 == 1 && blue2 == 2) 
		{note = 24;} 
    
    else if (red2 == 1 && green2 == 2 && blue2 == 0) 
		{note = 26;} 
    
    else if (red2 == 0 && green2 == 2 && blue2 == 1) 
		{note = 3;} 
    
    else if (red2 == 2 && green2 == 0 && blue2 == 0) 
		{note = 13;} 
    
    else if (red2 == 2 && green2 == 0 && blue2 == 1) 
		{note = 8;} 
    
    else if (red2 == 2 && green2 == 0 && blue2 == 2) 
		{note = 5;} 
    
    else if (red2 == 1 && green2 == 0 && blue2 == 1) 
		{note = 1;} 
    
    else if (red2 == 1 && green2 == 0 && blue2 == 2) 
		{note = 8;} 
    
    else if (red2 == 1 && green2 == 2 && blue2 == 2) 
		{note = 5;}     
	System.out.println(note);	

// end color composition

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
        ImageIO.read(this.getClass().getResource("image3.jpg"));
      marchThroughImage(image);
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }

}
