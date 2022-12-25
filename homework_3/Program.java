public class Program {
    public static void main(String[] args) {
        LinkedList list = new LinkedList(null, null);

        list.addLastNode(11);
        list.addNode(21, list.binFindNode(0));
        list.addLastNode(55);
        list.addNode(48, list.binFindNode(0));
        list.addLastNode(78);
        list.addNode(25, list.binFindNode(1));

        System.out.print("\033[H\033[2J");
        view.printList(list);
        list.reverseList();
        view.printList(list);

    }
}
