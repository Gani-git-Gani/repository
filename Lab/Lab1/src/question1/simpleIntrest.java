package question1;

import java.util.Scanner;

public class simpleIntrest {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the principle amount :");
		double principle=scanner.nextDouble();
		System.out.println("Enter the time (in years)");
		double time=scanner.nextDouble();
		double intrestRate;
		if(principle>10000) {
			intrestRate=0.10;//10% intrest
		}else if(principle>=5000 && principle<=10000) {
			intrestRate=0.08;//8%intrest
		}else {
			intrestRate=0.05;//5%intrest
		}
		double simpleIntrest=(principle*intrestRate*time);
		System.out.println("The simple intrest is:"+simpleIntrest);
		System.out.println("The total amount after"+time+"years is:"+(principle+simpleIntrest));
		scanner.close();
	}

}
