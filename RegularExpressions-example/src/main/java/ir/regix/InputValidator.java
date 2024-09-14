package ir.regix;

import java.util.regex.Pattern;

public class InputValidator {

    // Regular expression for username
    private static final String USERNAME_PATTERN = "^[a-zA-Z0-9]{5,15}$";
    // Regular expression for email
    private static final String EMAIL_PATTERN = "^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$";
    // Regular expression for phone number
    private static final String PHONE_PATTERN = "^\\+\\d{1,3}\\s\\d{3}\\s\\d{3}\\s\\d{4}$";
    // Regular expression for password
    private static final String PASSWORD_PATTERN = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,20}$";

    // Method to validate username
    public static boolean validateUsername(String username) {
        return Pattern.matches(USERNAME_PATTERN, username);
    }

    // Method to validate email
    public static boolean validateEmail(String email) {
        return Pattern.matches(EMAIL_PATTERN, email);
    }

    // Method to validate phone number
    public static boolean validatePhoneNumber(String phoneNumber) {
        return Pattern.matches(PHONE_PATTERN, phoneNumber);
    }

    // Method to validate password
    public static boolean validatePassword(String password) {
        return Pattern.matches(PASSWORD_PATTERN, password);
    }
}
