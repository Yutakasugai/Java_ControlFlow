public class sumNumChallenge {

    public static void main(String[] args) {
        // Challenge to sum the numbers

        int count = 0;
        int total = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % 3 == 0 && i % 5 == 0) {

                total = total + i;
                System.out.println(total + " : " + i);
                count++;

                if (count == 5) {
                    System.out.println("The first 5 numbers divisible by both 3 and 5 is " + total);
                    break;
                }
            }
        }
    }
}
