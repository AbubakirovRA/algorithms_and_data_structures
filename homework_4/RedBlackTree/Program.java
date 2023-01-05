package RedBlackTree;

public class Program {
    public static void main(String[] args) {
        String[] food = new String[]{"Яблоко", "Томат", "Огурец", "Груша", 
        "Картофель", "Свекла", "Морковь", "Репа", "Зелень", "Салат"};

        RedBlackTree<String> tree = new RedBlackTree<>();

        for (String string : food) {
            tree.add(string);
        }

        System.out.print("\033[H\033[2J");

        System.out.println(tree.containsRec("Яблоко"));
        System.out.println(tree.contains("Томат"));
        System.out.println(tree.containsRec("Хвост"));

    }
}
