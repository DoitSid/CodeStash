import java.security.SecureRandom;

public class PasswordGenerator {
    private static final String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%&*";

    public static void main(String[] args) {
        SecureRandom random = new SecureRandom();
        StringBuilder password = new StringBuilder();
        
        for (int i = 0; i < 10; i++) {  // 10 characters long
            int index = random.nextInt(CHARS.length());
            password.append(CHARS.charAt(index));
        }
        
        System.out.println("Generated Password: " + password);
    }
}
