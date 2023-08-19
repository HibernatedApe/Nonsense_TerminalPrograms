import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter First Value: ");
        int firstValue = scanner.nextInt();
        
        System.out.print("Enter Second Value: ");
        int secondValue = scanner.nextInt();
        
        System.out.println("\n" + firstValue + " + " + secondValue + " = " + firstValue + "" + secondValue);
        
    }
}