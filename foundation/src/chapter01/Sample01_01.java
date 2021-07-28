package chapter01;

public class Sample01_01 {

	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int[] numbers ={1, 4, 6, 9, 13, 16}; 
	    
	    int oddSum = 0;
	    int evenSum = 0;
	    
	    // for文を用いて、配列numbersの偶数の和と奇数の和を求めてください
	      for (int number : numbers) {
	      if (number % 2 == 0) {
	        evenSum += number;
	      } else {
	        oddSum += number;
	      }
	    }

	    System.out.println("奇数の和は" + oddSum + "です");
	    System.out.println("偶数の和は" + evenSum + "です");
	}

}
