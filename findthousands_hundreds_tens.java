import java.util.*;
public class findthousands_hundreds_tens {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int thousands = (number / 1000) % 10;
        int hundreds = (number / 100) % 10;
        int tens = (number / 10) % 10; 

        System.out.println("Thousands: " + thousands);
        System.out.println("Hundreds: " + hundreds);
        System.out.println("Tens: " + tens);
    }
}