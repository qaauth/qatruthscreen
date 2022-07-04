package Other_codes;

	import java.io.File;

import net.sourceforge.tess4j.ITesseract;
	import net.sourceforge.tess4j.Tesseract;
	import net.sourceforge.tess4j.TesseractException;

	public class TestImage {
		
		public static String crakImage(String filePath) throws TesseractException {
			File imgFile=new File(filePath);
			ITesseract instace=new Tesseract();
			instace.setDatapath("/home/rohit.singh/Downloads/truth_screen/Test-Data");
			String result=instace.doOCR(imgFile);
			return result;
		
		}
		public static void main(String[] args) throws TesseractException {
			
			String testData = TestImage.crakImage("/home/rohit.singh/Downloads/truth_screen/Images/pngtree-motivational-quote-poster-work-hard-play-more-inspiration-quotes-png-image_3627575.jpg");
			System.out.println(testData);
			
		}
}
