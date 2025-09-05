package Assignment;

public class HollowSquare {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                // Print 'x' for boundary elements
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("* ");
                } else {
                    System.out.print("  "); // spaces for hollow part
                }
            }
            System.out.println();
        }

	}

}
