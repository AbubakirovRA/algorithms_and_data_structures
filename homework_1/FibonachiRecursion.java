/*
 * Задание: 
 *
Пишем алгоритм поиска нужного числа последовательности Фибоначчи.
Считаем, что 1 и 2 значения последовательности равны 1. 
Искать будем по формуле 
                On=On-1+On-2
что предполагает использовать рекурсивного алгоритма. 

Можно объяснить на псевдокоде, чтобы не писать готовое
решение вместо студентов. После написания стоит показать схему
расчета сложности из методических материалов, где явно видно, что
подобного рода рекурсия имеет экспоненциальную сложность.
           n
          / \
     n-1      n-2     -------- 2^1 операций
     / \      / \
   n-2 n-3  n-3 n-4   -------- 2^2 операций 
     / \
   n-3 n-4            -------- 2^3 операций
 ........     ........
 n-n-1 n-n-2          -------- 2^(n-1) операций
 */

public class FibonachiRecursion {
    public static int fb(int num) {
        if (num <= 2) {
            return 1;
        } else {
            return fb(num-1) + fb(num-2);
        }
    }
}
