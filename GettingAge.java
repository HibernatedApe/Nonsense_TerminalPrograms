import java.util.Scanner;

public class GettingAge {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Birth Year: ");
        int birthYear = scanner.nextInt();
        
        System.out.print("Enter Current Year: ");
        int currentYear = scanner.nextInt();
        
        System.out.println("\nYour age is:");
        System.out.println("" + currentYear + " - " + birthYear);
        
    }
}