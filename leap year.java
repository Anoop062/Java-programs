import java.util.Scanner;
class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int y =sc.nextInt();
		if(y%400==0) {
			System.out.println("leap Year");
		}
		else if(y%4==0 && y%100!=0) {
			System.out.println("leap Year");
		}
		else {

			System.out.println("Not a leap year");
		}
	}
}