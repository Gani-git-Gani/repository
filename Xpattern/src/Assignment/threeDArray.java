package Assignment;
import java.util.Scanner;
public class threeDArray {

	public static void main(String[] args) {
		int arr[][][]=new int[2][2][5];
		Scanner s= new Scanner(System.in);
		for(int i=0;i<=arr.length-1;i++) {
			System.out.println("College"+i);
			for(int j=0;j<=arr[i].length-1;j++) {
				System.out.println("Classroom"+j);
				for(int k=0;k<=arr[i][j].length-1;k++) {
					System.out.println("Students"+k);
					System.out.println(arr[i][j][k]);
					arr[i][j][k]=s.nextInt();
				}
			}
		}

	}

}
