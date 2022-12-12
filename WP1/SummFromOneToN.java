/*Задание:
Необходимо написать алгоритм, считающий сумму всех чисел от 1 до N.
Согласно свойствам линейной сложности, количество итераций цикла
будет линейно изменяться относительно изменения размера N.
Пример решения: */
/**
 * example1
 */
public class SummFromOneToN {
    public static int sum(int lastNumber) {
        int sum = 0;
        for (int i = 1; i <=lastNumber; i++){
            sum+=i;
        }
        
        return sum;
    }
    
}
