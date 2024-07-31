package exercises;

public class Exercise3 {

    public static void divide() {

        int[] inputs;

        while (true) {
            inputs = Exercise2.getUserInput();
            if(inputs[1] == 0) {
                System.out.println("Cannot divide by zero. Please try again.");
                divide();
            }
        }

    }

}