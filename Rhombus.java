
public class Rhombus {
    public static void Hollow_Rhombus(int n) {
        for (int i = 1; i <= n; i++) {
            // Print leading spaces (corrected condition)
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            // Print stars and spaces for hollow structure
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // Move to next line
            System.out.println();
        }
    }

    public static void main(String args[]) {
        Hollow_Rhombus(5); // You can change the value for different sizes
    }
}
