package Other_codes;

import java.io.File;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

public class ReadImages {

	public static void main(String[] args) {

		ITesseract image= new Tesseract();

		try 
		{
			String str = image.doOCR(new File("C:\\\\git\\\\SDET\\\\Image\\\\Sample-png-Image-for-Testing.png"));
			System.out.println("Data from Image is "+str);
		} catch (TesseractException e) {
			System.out.println("Exception "+e.getMessage());
		}
	}
}
