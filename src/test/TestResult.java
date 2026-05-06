package test;

import domain.Exercise;
import java.util.Arrays;

public class TestResult {

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 2, 4, 2, 5};

        int result = Exercise.calculate(data);

        System.out.println("Масив: " + Arrays.toString(data));
        System.out.println("Число, що повторюється найчастіше: " + result);
    }
}
