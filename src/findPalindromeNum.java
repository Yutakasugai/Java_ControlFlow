public class findPalindromeNum {

    public static void main(String[] args) {
        System.out.println("-1221 is" + (isPalindrome(-1221) == true ? "" : " not") + " Palindrome");
        System.out.println("707 is" + (isPalindrome(707) == true ? "" : " not") + " Palindrome");
        System.out.println("11212 is" + (isPalindrome(11212) == true ? "" : " not") + " Palindrome");
        System.out.println("34543 is" + (isPalindrome(34543) == true ? "" : " not") + " Palindrome");
    }

    public static boolean isPalindrome (int number) {

        int reverse = 0;
        int multiplier = 10;
        int tempNum = number;
        number = number < 0 ? (number * -1) : number;
        tempNum = tempNum < 0 ? (tempNum * -1) : tempNum;

        // System.out.println(number);

        while (number > 0) {
            int lastDigit = number % 10;
            reverse = (reverse * multiplier) + lastDigit;
            number = number / 10;
        }

        if (reverse == tempNum) {
            // This number is palindrome
            return true;
        } else {
            // This is not
            return false;
        }
    }
}
