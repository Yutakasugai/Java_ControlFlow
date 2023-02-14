public class SwitchChallenge {

    // Switch Challenge
    public static void main(String[] args) {

        char key_char = 'A';

        switch (key_char) {
            case 'A':
                System.out.print(key_char + ": Able");
                break;
            case 'B':
                System.out.print(key_char + ": Baker");
                break;
            case 'C':
                System.out.print(key_char + ": Charlie");
                break;
            case 'D':
                System.out.print(key_char + ": Dog");
                break;
            case 'E':
                System.out.print(key_char + ": Easy");
                break;
            default:
                System.out.print("Not found...");
                break;
        }
    }
}
