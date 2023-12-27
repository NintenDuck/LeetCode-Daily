// A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
// removing all non-alphanumeric characters, it reads the same forward and backward.
// Alphanumeric characters include letters and numbers.
// Given a string s, return true if it is a palindrome, or false otherwise.

public class IsPalindrome {
    public static void main(String[] args) {
        String phrase = "A man, a plan, a canal: Panama";
        System.out.println("Is: '" + phrase + "' a Palindrome?");
        System.out.println(isPalidrome(phrase));
    }

    private static boolean isPalidrome(String s) {
        String reversed;

        s = s.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        reversed = new StringBuilder(s).reverse().toString();

        return s.equals(reversed) ? true : false;
    }
}
