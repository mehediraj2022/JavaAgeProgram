import java.util.Scanner;
import java.time.Year;

public class AgeProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter my birth year");
        int birthYear = 2001;

        int currentYear = Year.now().getValue();
        int age = currentYear - birthYear;

        System.out.println(" I am " + age + " years old in " + currentYear + ".");
        
input.close();
    }
}