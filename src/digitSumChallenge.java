public class digitSumChallenge {

    public static void main(String[] args) {
        System.out.println(sumDigits(125));
    }

    public static int sumDigits (int number) {
        if (number < 0) {
            return -1; // this number is invalid
        } else {

            int total = 0;

            while (number > 0) {
                // System.out.println( number % 10);
                total = total + (number % 10);
                number = number / 10;
                System.out.println(number);
            }

            return total;
        }
    }
}
