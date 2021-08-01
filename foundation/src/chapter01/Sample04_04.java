package chapter01;

public class Sample04_04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int x = 60;
		int y = 75;

		System.out.println("1:(x > 70 && y <= 80)     = " + (x > 70 && y <= 80));
		System.out.println("2:(x > 70 || y <= 80)        = " + (x > 70 || y <= 80));
		System.out.println("3:!(x > 70)                       = " + !(x > 70));
		System.out.println("4:(x > 70 && ++y == 80) = " + (x > 70 && ++y == 80));
		System.out.println("5:y = " + y);
	}

}
