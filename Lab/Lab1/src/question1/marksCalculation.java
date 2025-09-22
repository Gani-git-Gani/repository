package question1;

import java.util.Scanner;

public class marksCalculation {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		double totalMarks=0;
		System.out.println("Enter marks of 5 subjects(each out of 100:)");
		for(int i=1;i<=5;i++) {
			System.out.println("Subject"+i+":");
			double marks=scanner.nextDouble();
			while(marks<0||marks>100) {
				System.out.println("Invalid marks,Please Enter marks between 0 to 100:");
			}
			totalMarks+=marks;
		}
		double average = totalMarks/5;
		
		String grade;
		if(average>90) {
			grade="Ex";
		}else if(average>80){
			grade="A";
		}else if(average>60) {
			grade="B";
		}else if(average>40) {
			grade="C";
		}else {
			grade="F";
		}
		System.out.println("\nResults:");
		System.out.println("Total Marks:"+totalMarks+"/500");
		System.out.println("Average :"+average+"%:");
		System.out.println("Grade:"+grade);
		scanner.close();

	}

}
