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
	  Picture lion = new Picture("octo.jpeg");
	  lion.explore();
	  lion.mirrorDiagonalOther();
	  lion.explore();
	  lion.mirrorDiagonalOther();
	  lion.mirrorDiagonal();
	  lion.mirrorHorizontal();
	  
	  lion.mirrorDiagonalOther();
	  lion.mirrorDiagonal();
	  lion.mirrorVertical();
	  lion.mirrorDiagonalOther();
	  lion.mirrorDiagonal();
	  lion.mirrorDiagonalOther();
	  lion.explore();
  }
  public static void testMirrorHorizontalTopToBottom()
  {
	  Picture kitten2 = new Picture("kitten2.jpg");
	  kitten2.explore();
	  kitten2.mirrorHorizontalTopToBottom();
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
  
  /** Method to test edgeDetection */
  public static void testEdgeDetection()
  {
    Picture swan = new Picture("swan.jpg");
    swan.edgeDetection(10);
    swan.explore();
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
    //testGrayscale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorVerticalRightToLeft();
    //testMirrorHorizontal();
    //testMirrorHorizontalTopToBottom();
    //testMirrorDiagonal();
    testMirrorDiagonalOther();
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
  }
}