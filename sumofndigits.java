import java.util.*;
public class sumofndigits {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        n = sc.nextInt();
        while (n > 0) {
            sum += n % 10; // Add the last digit to sum
            n /= 10; // Remove the last digit
        }
        System.out.println("Sum of digits is: " + sum);
    }
}