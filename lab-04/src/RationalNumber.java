public class RationalNumber {

    private String number;

    public RationalNumber(String number) {

        if (containsLetterRegex(number)) {
            throw new ArithmeticException("Rational number contains a letter");
        }

        if (number.length() == 1) {
            /// TODO: need to improve this moment. We can replace it with StringBuilder
            /// Hazardous moment
            /// "1"
            /// "1/1"

            number += "/1";
        }

        long occurrences = number.chars().filter(c -> c == '/').count();

        if (occurrences > 1) {
            throw new ArithmeticException("Rational number contains more than one slash");
        }

        this.number = number;
    }

    @Override
    public String toString() {
        return number;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public static boolean containsLetterRegex(String s) {
        // The \\D matches any character that is NOT a digit (0-9).
        // The ".*" on both sides allow for any other characters (digits) around the non-digit symbol.
        // The matches() method checks if the entire string matches the pattern.
        return s.matches(".*[^\\d/].*");
    }
}
