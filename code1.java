import java.awt.Component;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

class JavaWalkBufferedImageTest1 extends Component {

  public static void main(String[] foo) {
    new JavaWalkBufferedImageTest1();
  }

  public void printPixelARGB(int pixel,int pixel2) {
    int alpha = (pixel >> 24) & 0xff;
    int red = (pixel >> 16) & 0xff;
    int green = (pixel >> 8) & 0xff;
    int blue = (pixel) & 0xff;

    int Red = (pixel2 >> 16) & 0xff;
    int Green = (pixel2 >> 8) & 0xff;
    int Blue = (pixel2) & 0xff;
    System.out.println( red + ", " + green + ", " + blue);
    System.out.println( Red + ", " + Green + ", " + Blue);
    if (red >= 180 && green >= 180 && blue >= 180 && Red >= 180 && Green >= 180 && Blue >= 180 ){
      System.out.print("Printable");
    }
    else{
      System.out.println("Not printable, kindly check the Background color and retry");
    }
  }

  public void marchThroughImage(BufferedImage image) {
    int w = image.getWidth();
    int h = image.getHeight();
    System.out.println("width, height: " + w + ", " + h);

     int i = 40;
     int j = 40;
     int rw = 220;
     int rh = 35; 
        System.out.println("x,y: " + j + ", " + i + ", " + rw + " , " + rh);
        int pixel = image.getRGB(j, i);
        int pixel2 = image.getRGB(rw, rh);
        printPixelARGB(pixel,pixel2);   
        System.out.println("");
      }
    
  

  public JavaWalkBufferedImageTest1() {
    try {
      // get the BufferedImage, using the ImageIO class
      BufferedImage image = 
        ImageIO.read(this.getClass().getResource("Test1.png"));
      marchThroughImage(image);
    } catch (IOException e) {
      System.err.println(e.getMessage());
    }
  }

}