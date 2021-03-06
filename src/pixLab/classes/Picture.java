package pixLab.classes;
import java.awt.Color;
import java.awt.image.BufferedImage;

/**
 * A class that represents a picture.  This class inherits from 
 * SimplePicture and allows the student to add functionality to
 * the Picture class.  
 * 
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture 
{
  ///////////////////// constructors //////////////////////////////////
  
  /**
   * Constructor that takes no arguments 
   */
  public Picture ()
  {
    /* not needed but use it to show students the implicit call to super()
     * child constructors always call a parent constructor 
     */
    super();  
  }
  
  /**
   * Constructor that takes a file name and creates the picture 
   * @param fileName the name of the file to create the picture from
   */
  public Picture(String fileName)
  {
    // let the parent class handle this fileName
    super(fileName);
  }
  
  /**
   * Constructor that takes the width and height
   * @param height the height of the desired picture
   * @param width the width of the desired picture
   */
  public Picture(int height, int width)
  {
    // let the parent class handle this width and height
    super(width,height);
  }
  
  /**
   * Constructor that takes a picture and creates a 
   * copy of that picture
   * @param copyPicture the picture to copy
   */
  public Picture(Picture copyPicture)
  {
    // let the parent class do the copy
    super(copyPicture);
  }
  
  /**
   * Constructor that takes a buffered image
   * @param image the buffered image to use
   */
  public Picture(BufferedImage image)
  {
    super(image);
  }
  
  ////////////////////// methods ///////////////////////////////////////
  
  /**
   * Method to return a string with information about this picture.
   * @return a string with information about the picture such as fileName,
   * height and width.
   */
  public String toString()
  {
    String output = "Picture, filename " + getFileName() + 
      " height " + getHeight() 
      + " width " + getWidth();
    return output;
    
  }
  
  /** Method to set the blue to 0 */
  public void zeroBlue()
  {
    Pixel[][] pixels = this.getPixels2D();
    for (Pixel[] rowArray : pixels)
    {
      for (Pixel pixelObj : rowArray)
      {
        pixelObj.setBlue(0);
      }
    }
  }
  
  public void valentines()
  {
	  Picture valentines = new Picture("Burger.png");
	  Picture v2 = new Picture("code.png");
	  this.copy(valentines, 50, 100);
	  this.copy(v2, 50,1300);
	  valentines.keepOnlyBlue();
	  this.addMessage("<=>><=<<>>=<<==>><<><>><>><><======><<>><<<>>>><==><><><><><><><>===<><>==", 550, 150);
	  this.addMessage("My love for computer programming", 0, 30);
	  this.addMessage("Is only paralleled for my love of McDonalds", 1400, 900);
	  
  }
  
  public void keepOnlyBlue()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels)
	  {
		  for(Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(0);
			  pixelObj.setGreen(0);
		  }
	  }
	  
  }
  
  public void negate()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels)
	  {
		  for(Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed(255 - pixelObj.getRed());
			  pixelObj.setGreen(255 - pixelObj.getGreen());
			  pixelObj.setBlue(255 - pixelObj.getBlue());
		  }
	  }
  }
  public void greyScale()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels)
	  {
		  for(Pixel pixelObj : rowArray)
		  {
			  pixelObj.setRed((pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3);
			  pixelObj.setGreen((pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3);
			  pixelObj.setBlue((pixelObj.getRed() + pixelObj.getGreen() + pixelObj.getBlue()) / 3);
		  }
	  }
  }
  public void findFishes()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  for(Pixel[] rowArray : pixels)
	  {
		  for(Pixel pixelObj : rowArray)
		  {
			  if (pixelObj.getRed() > 30)
			  {
				  pixelObj.setRed(0);
				  pixelObj.setBlue(0);
				  pixelObj.setGreen(20);
			  }
			  if (pixelObj.getGreen() < 60)
			  {
				  pixelObj.setGreen(0);
			  }
			  pixelObj.setBlue(pixelObj.getBlue() - 45);
			
			  if(pixelObj.getBlue() > 110)
			  {
				  pixelObj.setBlue(pixelObj.getBlue() + 45);
			  }
		  }
	  }
  }
  
  public void glichArt()
  {
	 
	  Picture glitchy = new Picture("Burger.png");
	  this.copy(glitchy, 50,30);
	  Pixel currentPixel = null;
	  Pixel [][] myPixels = this.getPixels2D();
	  for(int row = 0; row < myPixels.length; row++)
	  {
		  for(int col = 0; col < myPixels[0].length; col++)
		  {
			  int blue = (int)(Math.random() * 256);
			  currentPixel = myPixels[row][col];
			  currentPixel.setBlue(blue);
		  }
	  }
	  this.mirrorVertical();
	  this.mirrorHorizontalTopToBottom();
	  this.mirrorRandom();
	  this.mirrorRandom();
	  this.mirrorRandom();
	  this.mirrorRandom();
	  this.mirrorRandom();
  }
  
  public void mirrorRandom()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  int mirrorPoint = (int)(Math.random() * 1500);
	  Pixel rightPixel = null;
	  int funRow = (int)(Math.random() * 799);
	  int realRow = (int)(Math.random() * 1200);
	  int funCol = (int)(Math.random() * 100);
	  int realCol = (int)(Math.random() * 1600);
	  for(int row = funRow; row < realRow ; row++)
	  {
		  for(int col = funCol; col < realCol; col++)
		  {
			  	
			 
			  	if(mirrorPoint -  col + mirrorPoint > 0 && mirrorPoint - col + mirrorPoint < 1900)
			  	{
		        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
			  	}
			  	else
			  	{
			  		rightPixel = pixels[row][col]; 
			  	}
		        int blue = (int)(Math.random() * 256);
		        int green = (int)(Math.random() * 256);
		        int red = (int)(Math.random() * 256);
		        rightPixel.setRed(red);
		        rightPixel.setBlue(green);
		        rightPixel.setGreen(blue);
		  }
	  }
  }
  
  public void mirrorDiagonal()
  {
	  Pixel[][] pixels = this.getPixels2D();
	  Pixel TR = null;
	  Pixel BL = null;
	  for(int row = 0; row < pixels.length; row++)
	  {
		  for(int col = 0; col < pixels[0].length; col++)
		  {
			  
			
			  
			  if(col < pixels.length && row < pixels[0].length && row != col)
			  {
				  TR = pixels[row][col];
				  BL = pixels[col][row];
				  BL.setColor(TR.getColor());
			  }
			
		  }
	  }
  }
  public void mirrorDiagonalOther()
  {
	  
	  Pixel topLeft = null;
	  Pixel bottomRight = null;
	  Pixel[][] pixels = this.getPixels2D();
	  int shortest = Math.min(pixels.length,pixels[0].length);
	  for(int row = 0; row < shortest; row++)
	  {
		  for(int col = 0; col < shortest; col++)
		  {
			  if(row + col != shortest -1)
			  {
				topLeft = pixels[row][col];
				bottomRight = pixels[shortest - col - 1][shortest - row - 1];
				topLeft.setColor(bottomRight.getColor());
			  }
			
		  }
	  }
  }
  
  /** Method that mirrors the picture around a 
    * vertical mirror in the center of the picture
    * from left to right */
  public void mirrorVertical()
  {
    Pixel[][] pixels = this.getPixels2D();
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int width = pixels[0].length;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < width / 2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][width - 1 - col];
        rightPixel.setColor(leftPixel.getColor());
      }
    } 
  }
  
  public void mirrorVerticalRightToLeft()
  {
	  Pixel [] [] pixels = this.getPixels2D();
	  Pixel leftPixel = null;
	  Pixel rightPixel = null;
	  int width = pixels[0].length;
	  
	  for(int row = pixels.length -1; row >= 0; row--)
	  {
		  for(int col = width / 2 - 1; col >= 0 ; col--)
		  {
			  leftPixel = pixels[row][col];
			  rightPixel = pixels[row][width - col - 1];
			  leftPixel.setColor(rightPixel.getColor());
					 
		  }
	  }
  }
  
  public void mirrorHorizontal()
  {
	  Pixel [][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int hight = pixels.length;
	  for (int col = pixels[0].length - 1; col >= 0; col--)
	  {
		  for(int row = hight / 2 - 1; row >= 0; row--)
		  {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[hight - row - 1][col];
			  topPixel.setColor(bottomPixel.getColor());
		  }
	  } 
  }
  public void mirrorHorizontalTopToBottom()
  {
	  Pixel [][] pixels = this.getPixels2D();
	  Pixel topPixel = null;
	  Pixel bottomPixel = null;
	  int hight = pixels.length;
	  for (int col = 0; col < pixels[0].length ; col++)
	  {
		  for(int row = 0; row < hight / 2 ; row++)
		  {
			  topPixel = pixels[row][col];
			  bottomPixel = pixels[hight - row - 1][col];
			  bottomPixel.setColor(topPixel.getColor());
		  }
	  }
  }
  
  public void mirrorSeagull()
  {
	  int mirrorPoint = 400;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 239; row < 341; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 239; col < 341; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	      }
	    }
  }
  public void thingForCollage(Picture fromPic, 
          int startRow, int startCol, int endRow, int endCol)
{
	  Pixel fromPixel = null;
	  Pixel toPixel = null;
	  Pixel[][] toPixels = this.getPixels2D();
	  Pixel[][] fromPixels = fromPic.getPixels2D();
	  int copyWidth = Math.min(fromPixels[0].length, endCol);
	  
	  for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < endRow ; fromRow++, toRow++)
	  {
		  for (int fromCol = 0, toCol = startCol; fromCol < fromPixels[0].length && toCol < copyWidth; fromCol++, toCol++)
		  {
			  fromPixel = fromPixels[fromRow][fromCol];
			  toPixel = toPixels[toRow][toCol];
			  toPixel.setColor(fromPixel.getColor());
		  }
	  }   
}
  public void monsterSnowman()
  {
	  int mirrorPoint = 200;
	    Pixel leftPixel = null;
	    Pixel rightPixel = null;
	    int count = 0;
	    Pixel[][] pixels = this.getPixels2D();
	    
	    // loop through the rows
	    for (int row = 150; row < 196; row++)
	    {
	      // loop from 13 to just before the mirror point
	      for (int col = 103; col < 192; col++)
	      {
	        
	        leftPixel = pixels[row][col];      
	        rightPixel = pixels[row - 20][mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	        rightPixel = pixels[row + 40][mirrorPoint - col + mirrorPoint];
	        rightPixel.setColor(leftPixel.getColor());
	        
	      }
	    }
  }
  public void rickRolled(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel secondRightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    Color secondRightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; col < pixels[0].length-2; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        secondRightPixel = pixels[row][col+2];
        rightColor = rightPixel.getColor();
        secondRightColor = secondRightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > edgeDist || leftPixel.colorDistance(secondRightColor) > edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  public void masterFile()
  {
    Picture koala = new Picture("koala.jpg");
    Picture moon = new Picture("blueMotorcycle.jpg");
   
    this.copy(moon,0,0);
    this.copy(koala,200,0);
    Picture moto = new Picture("butterfly1.jpg");
    moto.thingForCollage(new Picture("swan.jpg"), 24, 2, 79, 271);
    this.copy(moto,300,0);
    
  this.mirrorHorizontal();
    this.mirrorVertical();
    this.mirrorTemple();
    
  }
  
  
  
  /** Mirror just part of a picture of a temple */
  public void mirrorTemple()
  {
    int mirrorPoint = 276;
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    int count = 0;
    Pixel[][] pixels = this.getPixels2D();
    
    // loop through the rows
    for (int row = 27; row < 97; row++)
    {
      // loop from 13 to just before the mirror point
      for (int col = 13; col < mirrorPoint; col++)
      {
        
        leftPixel = pixels[row][col];      
        rightPixel = pixels[row]                       
                         [mirrorPoint - col + mirrorPoint];
        rightPixel.setColor(leftPixel.getColor());
      }
    }
  }
  
  /** copy from the passed fromPic to the
    * specified startRow and startCol in the
    * current picture
    * @param fromPic the picture to copy from
    * @param startRow the start row to copy to
    * @param startCol the start col to copy to
    */
  public void copy(Picture fromPic, 
                 int startRow, int startCol)
  {
    Pixel fromPixel = null;
    Pixel toPixel = null;
    Pixel[][] toPixels = this.getPixels2D();
    Pixel[][] fromPixels = fromPic.getPixels2D();
    for (int fromRow = 0, toRow = startRow; fromRow < fromPixels.length && toRow < toPixels.length; 
         fromRow++, toRow++)
    {
      for (int fromCol = 0, toCol = startCol; 
           fromCol < fromPixels[0].length &&
           toCol < toPixels[0].length;  
           fromCol++, toCol++)
      {
        fromPixel = fromPixels[fromRow][fromCol];
        toPixel = toPixels[toRow][toCol];
        toPixel.setColor(fromPixel.getColor());
      }
    }   
  }

  /** Method to create a collage of several pictures */
  public void createCollage()
  {
    Picture flower1 = new Picture("flower1.jpg");
    Picture flower2 = new Picture("flower2.jpg");
    this.copy(flower1,0,0);
    this.copy(flower2,100,0);
    this.copy(flower1,200,0);
    Picture flowerNoBlue = new Picture(flower2);
    flowerNoBlue.zeroBlue();
    this.copy(flowerNoBlue,300,0);
    this.copy(flower1,400,0);
    this.copy(flower2,500,0);
    this.mirrorVertical();
    this.write("collage.jpg");
  }
  
  
  /** Method to show large changes in color 
    * @param edgeDist the distance for finding edges
    */
  public void edgeDetection(int edgeDist)
  {
    Pixel leftPixel = null;
    Pixel rightPixel = null;
    Pixel[][] pixels = this.getPixels2D();
    Color rightColor = null;
    for (int row = 0; row < pixels.length; row++)
    {
      for (int col = 0; 
           col < pixels[0].length-1; col++)
      {
        leftPixel = pixels[row][col];
        rightPixel = pixels[row][col+1];
        rightColor = rightPixel.getColor();
        if (leftPixel.colorDistance(rightColor) > 
            edgeDist)
          leftPixel.setColor(Color.BLACK);
        else
          leftPixel.setColor(Color.WHITE);
      }
    }
  }
  
  public void encode(Picture hidden1)
  {
	  Pixel [][] currentPicture = this.getPixels2D();
	  Pixel [][] hiddenPicture = hidden1.getPixels2D();
	  Pixel currentPixel = null;
	  Pixel hiddenPixel = null;
	  for(int row =0; row < currentPicture.length; row++)
	  {
		  for(int col = 0; col< currentPicture[0].length; col++)
		  {
			  hiddenPixel = hiddenPicture[row][col];
			  currentPixel = currentPicture[row][col];
			  if(hiddenPixel.getRed() <= 100 && hiddenPixel.getGreen() <=100 && hiddenPixel.getBlue() <=100)
			  {
				  int currentRed = currentPixel.getRed();
				  if(currentRed % 2 == 0)
				  {
					  currentPixel.setRed(currentRed+1);
				  }
				  
			  }
			  else
			  {
				  int currentRed = currentPixel.getRed();
				  if(currentRed % 2 != 0)  
				  {
					  currentPixel.setRed(currentRed - 1);
				  }
			  }
		  }
	  }
	  this.write("encrypted.png");
	  this.explore();
  }
  
  public void decode()
  {
	  Pixel [][] decoded = this.getPixels2D();
	  Pixel currentPixel = null;
	  for(int row = 0; row < decoded.length; row++)
	  {
		  for(int col =0; col < decoded[0].length; col++)
		  {
			  currentPixel = decoded[row][col];
			  int currentRed = currentPixel.getRed();
			  if(currentRed % 2 ==0)
			  {
				  currentPixel.setColor(new Color(232, 100, 5));
				  
				  
			  }
			  
			  
		  }
	  }
	  this.explore();
	  
  }
  
 
  
  public void greenScreen(Picture hidden2)
  {
	  Pixel [][] currentPicture = this.getPixels2D();
	  Pixel [][] hiddenPicture = hidden2.getPixels2D();
	  Pixel currentPixel = null;
	  Pixel hiddenPixel = null;
	  for(int row = 0; row < currentPicture.length; row++)
	  {
		  for(int col = 0; col< currentPicture[0].length; col++)
		  {
			 
			  currentPixel = currentPicture[row][col];
			  
			  if(hiddenPicture.length > row && hiddenPicture[0].length  > col)
			  {
			  		hiddenPixel = hiddenPicture[row][col];
				  	if(hiddenPixel.getRed() <= 240 && hiddenPixel.getRed() >= 190 && hiddenPixel.getGreen() >= 190
				  			&& hiddenPixel.getGreen() <= 210 && hiddenPixel.getBlue() >= 180 && hiddenPixel.getBlue() <= 210)
				  	{
				  		currentPixel.setColor(hiddenPixel.getColor());
				  		
				  	}
			  }
		  }
	  }
	  this.write("encrypted.png");
	  this.explore();
	  
  }
  
  /* Main method for testing - each class in Java can have a main 
   * method 
   */
  public static void main(String[] args) 
  {
    Picture beach = new Picture("water.jpg");
    beach.explore();
    //beach.zeroBlue();
    //beach.explore();
    //beach.keepOnlyBlue();
    //beach.negate();
    //beach.greyScale();
    beach.findFishes();
    beach.explore();
  }
  
} // this } is the end of class Picture, put all new methods before this
