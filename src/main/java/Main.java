import exercises.Exercise1;
import exercises.Exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] inputs;
        inputs = Exercise2.getUserInput();
        System.out.println(Arrays.toString(inputs));
        System.out.println(Exercise1.divide(inputs[0], inputs[1]));
    }
}
