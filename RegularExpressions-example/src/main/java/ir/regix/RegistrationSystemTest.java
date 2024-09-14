package ir.regix;
import java.util.Scanner;

public class RegistrationSystemTest {


        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Get user inputs
            System.out.println("Enter username (5-15 characters, letters and digits only):");
            String username = scanner.nextLine();

            System.out.println("Enter email:");
            String email = scanner.nextLine();

            System.out.println("Enter phone number (Format: +98 912 345 6789):");
            String phoneNumber = scanner.nextLine();

            System.out.println("Enter password (8-20 characters, at least one uppercase, one lowercase, one number, and one special character):");
            String password = scanner.nextLine();

            // Validate inputs
            boolean isUsernameValid = InputValidator.validateUsername(username);
            boolean isEmailValid = InputValidator.validateEmail(email);
            boolean isPhoneNumberValid = InputValidator.validatePhoneNumber(phoneNumber);
            boolean isPasswordValid = InputValidator.validatePassword(password);

            // Display validation results
            if (isUsernameValid && isEmailValid && isPhoneNumberValid && isPasswordValid) {
                System.out.println("All inputs are valid. Registration successful!");
            } else {
                System.out.println("Invalid input(s):");
                if (!isUsernameValid) {
                    System.out.println("- Invalid username");
                }
                if (!isEmailValid) {
                    System.out.println("- Invalid email");
                }
                if (!isPhoneNumberValid) {
                    System.out.println("- Invalid phone number");
                }
                if (!isPasswordValid) {
                    System.out.println("- Invalid password");
                }
            }
        }
    }
