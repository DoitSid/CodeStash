import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class BirthdayInYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
    
        System.out.print("Enter your birth month between (1-12)= ");
        int birthMonth = scanner.nextInt();
        
        System.out.print("Enter your birth date between (1-31)= ");
        int birthDay = scanner.nextInt();
        
        
        System.out.print("Enter the year you want to check your birthday for= ");
        int year = scanner.nextInt();
        
        try {
            // Create a LocalDate object for the birthday in the specified year -sid
            LocalDate birthday = LocalDate.of(year, birthMonth, birthDay);
            
            // Get the day of the week- sid
            String dayOfWeek = birthday.getDayOfWeek().toString();
            
            // Format and display the birthday with the day of the week -sid
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM dd, yyyy");



            System.out.println("Your birthday in " + year + " will be on: " + birthday.format(formatter) + ", " + dayOfWeek);
        } catch (Exception e) {
            System.out.println("Invalid date entered. Please ensure the month and day are correct.");
        } finally {
            scanner.close();     //Its okay even if you forget to close the scanner sometimes :)
        }
    }
}
