package domain;

import java.util.Arrays;

public class Exercise {
    /**
     * Метод знаходить число, що зустрічається найчастіше в масиві.
     * Потрібен масив цілих чисел int[].
     */
    public static int calculate(int[] numbers) {
        if (numbers == null || numbers.length == 0) return 0;

        Arrays.sort(numbers);

        int mostFrequent = numbers[0];
        int maxCount = 1;
        int currentNumber = numbers[0];
        int currentCount = 1;

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] == currentNumber) {
                currentCount++;
            } else {
                if (currentCount > maxCount) {
                    maxCount = currentCount;
                    mostFrequent = currentNumber;
                }
                currentNumber = numbers[i];
                currentCount = 1;
            }
        }
        return (currentCount > maxCount) ? currentNumber : mostFrequent;
    }
}
