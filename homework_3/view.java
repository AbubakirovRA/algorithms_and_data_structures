public class view {
    public static void printList(LinkedList list){
        Node current = list.getHead();
        while (current != null){
            System.out.print(" " + current.value);
            current = current.nextNode;
        }
        System.out.println();
    }
}
