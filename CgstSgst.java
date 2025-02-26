import java.util.Scanner;

public class CgstSgst{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of the product: ");
        int value = sc.nextInt();

        if (value > 1000) {
            System.out.println("Enter your GST value (in percentage): ");
            int GST = sc.nextInt();

            double CGSTRate = GST / 2.0 / 100.0;
            double SGSTRate = GST / 2.0 / 100.0;

            double CGSTValue = value * CGSTRate;
            double SGSTValue = value * SGSTRate;

            double finalValue = value + CGSTValue + SGSTValue;

            System.out.println("CGST: " + CGSTValue);
            System.out.println("SGST: " + SGSTValue);
            System.out.println("Final Value (including CGST and SGST): " + finalValue);
        } else {
            System.out.println("No GST applied for products with value less than or equal to 1000.");
        }
    }
}