package Other_codes;

import java.io.*;

public class P1 {
	public static void main(String[] args)
	{
		int a = 8, total_marks = 10;
		float percentage;

		
			percentage = (float)((a/total_marks)*100);
			System.out.println(percentage);
			if(percentage == 80) {  
				System.out.println("Renew yor subscription 80% limit exhaust");
	
			}if(percentage == 90) {
				System.out.println("Renew yor subscription 90% limit exhaust");
		
			}
			if(percentage == 100) {
				System.out.println("Renew yor subscription 100% limit exhaust");
	
			
		}
	}
}