
import java.util.Random;
import java.util.Scanner;

public class BecauseICannotTakeMyOwnDecisions {
    public static void main(String[] args) {
        String[] responses = {
            "Yes", "No", "Ask again later", "It is certain", 
            "Don't count on it", "Most likely", "Outlook not so good", "Absolutely"
        };
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ask a yes-or-no question: ");
        scanner.nextLine();  // Read the question
        
        Random random = new Random();
        int index = random.nextInt(responses.length);
        
        System.out.println("Sid Says= " + responses[index]);
    }
}
