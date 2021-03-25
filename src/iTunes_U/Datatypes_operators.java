package iTunes_U;

public class Datatypes_operators {
    public static void main(String[] args) {

        // Primitive:
        byte age = 13;
        short week = 34;
        int num = 3648268;
        long phone = 736423462L;

        // Float-Point
        float weight1 = 3.25f;
        double weight2 = 1.45;

        // Boolean
        boolean isValid = true;
        boolean isNotValid = false;

        // Character
        char grade = 'A';

        // Chain Assignment
        int x, y, z;
        x = y = z = 100;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);

        // Shorthand assignment
        x = x + 10;
        System.out.println(x);
        y += 10;
        System.out.println(y);



        // Type conversion
                // Invalid
        short s;
        double d = 3.5;
        // s = d;
                // Valid:
        s = (short) d;
        System.out.println(s);

    }
}
