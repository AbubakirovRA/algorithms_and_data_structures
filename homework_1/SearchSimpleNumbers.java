/*Задание:
Написать алгоритм поиска простых чисел (делятся только на себя и на 1)
в диапазоне от 1 до N. В алгоритме будет использоваться вложенный for,
что явно говорит о квадратичной сложности, на этом стоит акцентировать
внимание
*/

import java.util.ArrayList;
import java.util.List;

public class SearchSimpleNumbers {
    public static List<Integer> findSimpleNumbers(int lastNumber) {
        List<Integer> result = new ArrayList<>();
        boolean simple = true;
        for (int i = 1; i <= lastNumber; i++) {
            simple = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    simple = false;
                    break;
                }
            }

            if (simple) {
                result.add(i);
            }
        }
        return result;
    }
}
