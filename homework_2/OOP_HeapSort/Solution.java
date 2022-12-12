public class Solution {

    public static void main(String[] args) {
       // задаем начальные данные:
       Heap heap = new Heap(31);
       heap.insertNode(120);
       heap.insertNode(40);
       heap.insertNode(50);
       heap.insertNode(80);
       heap.insertNode(20);
       heap.insertNode(100);
       heap.insertNode(150);
       heap.insertNode(30);
       heap.insertNode(210);
       heap.insertNode(180);
       heap.insertNode(10);
       heap.insertNode(90);
       // выводим начальную пирамиду в консоль
       heap.printHeap();
       // изменяем элемент под индексом 0 с 210 на 15, и выводим в консоль измененную пирамиду
       heap.changeNode(0,15);
       heap.printHeap();
       // удаляем элемент под индексом 3, который имеет значение 80 и смотрим на изменившуюся пирамиду
       heap.removeNode(3);
       heap.printHeap();
    }
}