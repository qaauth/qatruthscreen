package Other_codes;

public class p {
	public static void main(String[] args) {
		int a=9;
		int b=10;
		for (int i = a; i <= b; i++) {
			if(i == 8) {
				System.out.println("Renew yor subscription 80% limit exhaust");
				break;
			}if(i == 9) {
				System.out.println("Renew yor subscription 90% limit exhaust");
				break;
			}
			if(i == 10) {
				System.out.println("Renew yor subscription 100% limit exhaust");
				break;
			}
		}
	}
}
