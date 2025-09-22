package Assignment;

class HollowArrow {
    public static void main(String[] args) {
        int n = 5; // size of arrow head

        // Arrow head (hollow triangle)
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print hollow triangle part
            for (int k = 1; k <= (2 * i - 1); k++) {
                if (k == 1 || k == (2 * i - 1) || i == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Arrow shaft
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println("*****");
        }
    }
}
