/*
Задание:
Необходимо написать алгоритм поиска всех доступных комбинаций
(посчитать количество) для количества кубиков K с количеством граней N. 

При этом, стоит предложить студентам 2 варианта на выбор –
количество кубиков может быть строго ограничено (4 кубика, например),
либо их количество будет динамическим. 

Какой вариант алгоритма они
захотят реализовать – тот и реализуют.

Если студент реализует простой вариант, обращает внимание, что
данное решение имеет сложность O(n4), но если количество кубиков
сделать переменной, то она трансформируется в O(nk), что будет
представлять собой экспоненциальную сложность. 

Для второго решения очевидно, что его сложность O(nk) с самого начала.
*/


/**
* Простой вариант (количество кубиков 4)
*/
public class CubeCombination {
    public static int combinationCount(int faces) {
        int count = 0;
        for (int i = 1; i <= faces; i++) {
            for (int j = 1; j <= faces; j++) {
                for (int k = 1; k <= faces; k++) {
                    for (int l = 1; l <= faces; l++) {
                    count++;
                    }
                }
            }
        }

        return count;
    }


/**
* Сложный вариант - количество кубиков задается условием
*/
    public static int combinationCount(int count, int faces) {
        if (count > 0) {
            return recursiveCounter(1, count, faces);
        } else {
            return 0;
        }
    }

    private static int recursiveCounter(int depth, int maxDepth, int faces) {
        int count = 0;
        for (int i = 1; i <= faces; i++) {
            if (depth == maxDepth) {
            count++;
            } else {
                count += recursiveCounter(depth + 1, maxDepth, faces);
            }
        }

        return count;
    }
}


