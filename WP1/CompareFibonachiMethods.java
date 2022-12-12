import java.util.Date;

/*
 * Необходимо сравнить скорость работы 2 алгоритмов вычисления чисел
Фибоначчи и определить, какой из них работает быстрее. Так различия
начнутся уже с 40 члена последовательности.
 */

public class CompareFibonachiMethods {
    public static void main(String[] args) {
        for (int i = 10; i <= 50; i = i + 10) {
            Date startDate = new Date();
            FibonachLineMethod.fb(i);
            Date endDate = new Date();
            long lineDuration = endDate.getTime() - startDate.getTime();

            startDate = new Date();
            FibonachiRecursion.fb(i);
            endDate = new Date();
            long recursiveDuration = endDate.getTime() - startDate.getTime();

        System.out.printf("i: %s, line duration: %s, recursive duration: %s%n", i, lineDuration, recursiveDuration);
        }
    }
       
}
