package iTunes_U;

public class BreakContinueDemo {
    public static void main(String[] args) {

        // BREAK

        int num = 100;

        for (int i = 0; i < num; i++) {
            if (i * i >= num) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println("Load complete");



    // CONTINUE
        for (int j = 0; j <= 100; j++) {
            if ((j % 2) != 0) {
                continue;
            }
            System.out.print(j + " ");
        }



    }
}
