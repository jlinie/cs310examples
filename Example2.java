import java.util.Scanner;

public class Example2{
		public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter year");
		int curr_year = input.nextInt();
		
		if(curr_year % 4 == 0 ) {
			if(curr_year %100==0) {
				if(curr_year %400==0) {
					System.out.println("It is a leap year!");
				}else {
					System.out.println("It's not a leap year.");
				}
			}else {
				System.out.println("It's not a leap year.");
			}
		}else {
			System.out.println("It's not a leap year.");
		}	
	}
	
}
