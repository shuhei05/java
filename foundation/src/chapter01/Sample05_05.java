package chapter01;

public class Sample05_05 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		 byte a = 0b00010101;
		    byte b = 0b00111010;
		    System.out.println(Integer.toBinaryString( a ) );
		    System.out.println(Integer.toBinaryString( b ) );
		    byte resultAnd = (byte) (a & b);
		    System.out.println(Integer.toBinaryString( resultAnd ) );
		    byte resultOR= (byte) (a | b);
		    System.out.println(Integer.toBinaryString( resultOR ) );
		    byte resultXOR =  (byte) (a ^ b);
		    System.out.println(Integer.toBinaryString( resultXOR ) );
		    byte resultNOT =  (byte) ~a;
		    System.out.println(Integer.toBinaryString( resultNOT ) );

	}

}
