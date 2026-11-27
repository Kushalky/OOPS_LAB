import java.util.Scanner;

public class LAB6{
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);
        String validDomain = "bmsce.ac.in";

        System.out.print("Enter a student's email address: ");
        String email = scanner.nextLine();

        System.out.println("Length: " + email.length());

        int atIndex = email.indexOf('@');
        if (atIndex >= 0) {
            String username = email.substring(0, atIndex);
            String domain = email.substring(atIndex + 1);

            System.out.println("Username: " + username);
            System.out.println("Domain: " + domain);
            System.out.println("Belongs to the institution: " + domain.equalsIgnoreCase(validDomain));
        } else {
            System.out.println("The email address does not contain an @ symbol.");
        }

        System.out.println("Lowercase email: " + email.toLowerCase());

        System.out.print("Enter a prefix to check: ");
        String prefix = scanner.nextLine();
        System.out.println("Starts with prefix: " + email.startsWith(prefix));

        System.out.println("Ends with " + validDomain + ": " + email.endsWith(validDomain));
        System.out.println("Updated email: " + email.replace(validDomain, "cse.bmsce.ac.in"));

        System.out.print("Enter a character or sequence to search for: ");
        String searchText = scanner.nextLine();
        System.out.println("Contains \"" + searchText + "\": " + email.contains(searchText));

        String trimmedEmail = email.trim();
        System.out.println("Trimmed email: " + trimmedEmail);

        System.out.print("Enter another email address to compare: ");
        String secondEmail = scanner.nextLine();
        System.out.println("Email addresses are identical (ignoring case): "
                + email.equalsIgnoreCase(secondEmail));
        
        System.out.println("Kushal K Y");
        System.out.println("1WN25CS118");

        scanner.close();
    }
}
