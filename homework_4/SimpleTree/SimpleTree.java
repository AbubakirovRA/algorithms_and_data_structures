package SimpleTree;
import java.util.ArrayList;
import java.util.List;

public class SimpleTree {
    private Node root;

    public SimpleTree(Node root) {
        this.root = root;
    }

    public boolean checkExist(int value){
        if (root.getValue() != null){
            //Node node = depthSearch(root, value);
            Node node = widthSearch(value);
            if (node != null){
                return true;
            }
        }
        return false;
    }

    private Node depthSearch(Node node, int value){
        if (node.getValue() == value){                  //на каждой итерации рекурсии текущая нода является root
            return node;
        }else{
            for (Node child : node.getChildren()) {      //запускаем перебор всех детей ноды
                Node result = depthSearch(child, node.getValue());  //запускаем проверку детей на соответствие value
                if (result != null){    //проверка на равность value проходит в первом блоке if 
                                        //для каждой ноды в результате рекурсии, и если что-то найдено,
                                        //то сюда вернется не нулевое значение, значит соответствие есть
                    return result;
                }
            }
        }
        return null;
    }

    private Node widthSearch(int value) {               //проверка нод "построчно"
        List<Node> currentLine = new ArrayList<>();     //текущая строка нод
        currentLine.add(root);                          //Включаем корень дерева в текущую строку
        while (currentLine.size() > 0){                 //пока в текущей строке есть елементы проверка продолжается
            List<Node> nextLine = new ArrayList<>();    //список нод следующей строки вершин
            for (Node node : currentLine) {             //запускаем перебор всех нод текущей строки
                if (node.getValue() == value){          //если нашли
                    return node;                        //возвращаем значение цикл останавливаем
                }
                nextLine.addAll(node.getChildren());    //не нашли, включаем всех детей нод текущей строки, 
                                                        //как вершины следующей строки
            }
            currentLine = nextLine;                     // далее назначаем текущей строкой слудующую, цикл повторяется
        }
        return null;                                    //ничего не найдено
    }
}
