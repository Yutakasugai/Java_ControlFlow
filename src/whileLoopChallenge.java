public class whileLoopChallenge {

    // this is main method to see even numbers
    public static void main(String[] args) {

        int num = 4;
        int finishNum = 20;

        while (num <= finishNum) {

            num = num + 1;
            if (!isEvenNumber(num)) { // this is even number
                continue;
            }

            System.out.println(num + " is an even number on the range from 5 to 20...");
        }
    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) { // Check if it is an even number
            return true;
        } else {
            return false;
        }
    }
}
