package pixLab.classes;
/**
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Arick Smith 
 */
public class PictureTester
{
  /** Method to test zeroBlue */
  public static void testZeroBlue()
  {
    Picture beach = new Picture("beach.jpg");
    beach.explore();
    beach.zeroBlue();
    beach.explore();
  }
  
  public static void glitchRun()
  {
	  Picture glitchPic = new Picture("mcdonalds.jpg");
	  glitchPic.explore();
	  glitchPic.glichArt();
	  glitchPic.explore();
	  
  }
  
  public static void testRickRolled()
  {
	  Picture beach = new Picture("swan.jpg");
	    beach.explore();
	    beach.rickRolled(10);
	    beach.explore();
  }
  
  public static void testMirrorDiagonal()
  {
	  Picture money = new Picture("Earth.jpeg");
	  money.explore();
	  money.mirrorDiagonal();
	  money.explore();
  }
  
  /** Method to test mirrorVertical */
  public static void testMirrorVertical()
  {
    Picture caterpillar = new Picture("caterpillar.jpg");
    caterpillar.explore();
    caterpillar.mirrorVertical();
    caterpillar.explore();
  }
  public static void testMirrorVerticalRightToLeft()
  {
	  Picture lion = new Picture("femaleLionAndHall.jpg");
	  lion.explore();
	  lion.mirrorVerticalRightToLeft();
	  lion.explore();
  }
  public static void testMirrorHorizontal()
  {
	  Picture lion = new Picture("femaleLionAndHall.jpg");
	  lion.explore();
	  lion.mirrorHorizontal();
	  lion.explore();
  }
  public static void testMirrorDiagonalOther()
  {
	  Picture lion = new Picture("seagull.jpg");
	  lion.explore();
	  lion.mirrorDiagonalOther();
	  lion.explore();
	  lion.mirrorDiagonalOther();
	  lion.mirrorDiagonal();
	  lion.mirrorHorizontal();
	  lion.mirrorDiagonalOther();
	  lion.mirrorDiagonal();
	  lion.mirrorHorizontalTopToBottom();
	  lion.mirrorVerticalRightToLeft();
	  lion.monsterSnowman();
	  lion.mirrorVertical();
	  lion.mirrorDiagonalOther();
	  lion.mirrorDiagonal();
	  lion.mirrorDiagonalOther();
	  lion.explore();
  }
  
  public static void valentines()
  {
	  Picture valen = new Picture("mcdonalds.jpg");
	  valen.valentines();
	  valen.explore();
	  valen.write("ValMeme");
  }
  public static void testMirrorHorizontalTopToBottom()
  {
	  Picture kitten2 = new Picture("seagull.jpg");
	  kitten2.explore();
	  kitten2.mirrorHorizontalTopToBottom();
	  kitten2.explore();
  }
  public static void testMirrorSeagull()
  {
	  Picture kitten2 = new Picture("seagull.jpg");
	  kitten2.explore();
	  kitten2.mirrorSeagull();
	  kitten2.explore();
  }
  
  /** Method to test mirrorTemple */
  public static void testMirrorTemple()
  {
    Picture temple = new Picture("temple.jpg");
    temple.explore();
    temple.mirrorTemple();
    temple.explore();
  }
  
  /** Method to test the collage method */
  public static void testCollage()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.createCollage();
    canvas.explore();
  }
  public static void masterFile()
  {
    Picture canvas = new Picture("640x480.jpg");
    canvas.masterFile();
    canvas.explore();
  }
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
  }
  
  public static void testMonsterSnowman()
  {
	  Picture kitten2 = new Picture("snowman.jpg");
	  kitten2.explore();
	  kitten2.monsterSnowman();
	  kitten2.explore();
  }
  
  public static void testSteganography()
  {
	  Picture source = new Picture("hidden2.png");
	  source.explore();
	  Picture hidden = new Picture("Hidden1.png");
	  hidden.explore();
	  source.encode(hidden);
	  source.decode();
  }
  
  /** Main method for testing.  Every class can have a main
    * method in Java */
  public static void main(String[] args)
  {
    // uncomment a call here to run a test
    // and comment out the ones you don't want
    // to run
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
	//testRickRolled();
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalTopToBottom();
	//testMonsterSnowman();
	//testMirrorSeagull();
    //testMirrorDiagonal();
	//masterFile();
	//valentines();
	//  glitchRun();
    //testMirrorDiagonalOther();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
	  testSteganography();
  }
}