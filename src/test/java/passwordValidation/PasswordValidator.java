package passwordValidation;

public class PasswordValidator {
    public static boolean isValid(String password) {
        return hasLowerCase(password) &&
            hasMoreThanEightChars(password) &&
            hasUppercase(password) &&
            hasNumber(password) &&
            hasUnderscore(password);
    }

    private static boolean hasUnderscore(String password) {
        return password.matches(".*_+.*");
    }

    private static boolean hasNumber(String password) {
        return password.matches(".*\\d+.*");
    }

    private static boolean hasUppercase(String password) {
        return !password.equals(password.toLowerCase());
    }

    private static boolean hasMoreThanEightChars(String password) {
        return password.length() > 8;
    }

    private static boolean hasLowerCase(String password) {
        return !password.equals(password.toUpperCase());
    }
}
