package ODDNUM;

public class oddEven {
	public static void main(String[] args) {
		int n = 10;
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i = 0; i <=2*n; i++) {
			if((i&1)==0)

				evenSum += i ;
			else
				oddSum += i;
			
		}
		System.out.println("sum of first"+n+"even numbers ="+evenSum);
		System.out.println("sum of first"+n+"odd numbers ="+oddSum);
		
	}

}
