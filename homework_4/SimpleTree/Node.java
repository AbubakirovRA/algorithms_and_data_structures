package SimpleTree;
import java.util.List;

/**
 * Node
 */
public class Node {
    private int value;
    private List<Node> children;

    public Integer getValue(){
        return value;
    }

    public List<Node> getChildren(){
        return children;
    }
}