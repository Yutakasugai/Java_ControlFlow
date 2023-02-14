public class findPrimeNumber {

    public static void main(String[] args) {

//        System.out.println("0 is " + (isPrime(0) ? "" : "Not") + " a prime number");
//        System.out.println("-1 is " + (isPrime(-1) ? "" : "Not") + " a prime number");
//        System.out.println("4 is " + (isPrime(4) ? "" : "Not") + " a prime number");
//        System.out.println("7 is " + (isPrime(7) ? "" : "Not") + " a prime number");
//        System.out.println("17 is " + (isPrime(17) ? "" : "Not") + " a prime number");
//        System.out.println("51 is " + (isPrime(51) ? "" : "Not") + " a prime number");
//        System.out.println("62 is " + (isPrime(62) ? "" : "Not") + " a prime number");

        // Challenge to find how many of prime number can be found in the given number
        int count = 0;

        // Loop a given number
        for (int i = 10; i <= 50; i ++) {
            if (!isPrime(i)) {
                System.out.println(i +  " is a prime number");

                count = count + 1;

                if (count == 3) {
                    break;
                }
            }
        }
    }

    public static boolean isPrime (int number) {
        if (number < 2) {
            return false;

        }

        for (int counter = 2; counter < number; counter ++) {
            if (number % counter == 0) {
                return true;
            }
        }

        return false;
    }
}
