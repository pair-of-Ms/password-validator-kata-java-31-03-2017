package passwords;

public class PasswordValidator {

    private static final int MINIMUM_LENGTH = 9;

    public static boolean isValid(String password) {
        return containsAtLeastOneUnderscore(password)
            && containsAtLeastOneNumber(password)
            && containsAtLeastOneLowercase(password)
            && containsAtLeastOneUppercase(password)
            && isLongEnough(password);
    }

    private static boolean containsAtLeastOneUnderscore(String password) {
        return password.contains("_");
    }

    private static boolean isLongEnough(String password) {
        return password.length() >= MINIMUM_LENGTH;
    }

    private static boolean containsAtLeastOneUppercase(String password) {
        return password.matches(".*[A-Z]+.*");
    }

    private static boolean containsAtLeastOneLowercase(String password) {
        return password.matches(".*[a-z]+.*");
    }

    private static boolean containsAtLeastOneNumber(String password) {
        return password.matches(".*\\d+.*");
    }
}
