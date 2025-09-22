package question2;

import java.util.Scanner;

public class sumAndAverage {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the number of elements:");
		int n=scanner.nextInt();
		int[] array=new int[n];
		System.out.println("Enter"+n+"integers:");
		for(int i=0;i<n;i++) {
			array[i]=scanner.nextInt();
		}
		int sum=0;
		for(int num:array) {
			sum+=num;
		}
		double average=(double)sum/n;
		System.out.println("Sum :"+sum);
		System.out.println("Average :"+average);
		scanner.close();
		
	}

}
