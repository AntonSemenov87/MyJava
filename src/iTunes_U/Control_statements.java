package iTunes_U;

public class Control_statements {
    public static void main(String[] args) {

        // Sequence
        // Selection (if else)
        // Repetition (while, do-while, for)

        // SELECTION:
        int i = 11;
        int j = 18;
        if (i == 10) {
            if (j < 20) {
                System.out.println("Do this");
            }
            else {
                System.out.println("Do that");
            }
        } else {
            System.out.println("int i is NOT equal to 10");
        }


        // SWITCH
        int a = 10;
        switch (a) {
            case 0:
                System.out.println("a is 0");
            case 5:
                System.out.println("a is 5");
            case 10:
                System.out.println("a is 10");
        }



        // REPETITION

        // for loop
        for (int k = 1; k <= 10; k++) {
            System.out.print(k + " ");
        }
        System.out.println();

        // while
        char ch = 'a';
        while (ch <= 'z') {
            System.out.print(ch + " ");
            ch++;
        }
        System.out.println();

        //do-while
        char ch1 = 'a';
        do {
            System.out.print(ch1 + " ");
            ch1++;
        } while (ch1 <= 'z');

    }



}
