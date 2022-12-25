public class LinkedList {
    private Node head;
    private Node tail;

    public LinkedList(Node head, Node tail) {
        this.head = head;
        this.tail = tail;
    }

    public Node getHead(){
        return head;
    }

    public Node getTail(){
        return tail;
    }

    public Node simpleFindNode(int value){//здесь производим проверку значения ноды
        Node node = head;
        while (node.nextNode != null){
            node = node.nextNode;
            if (node.value == value){
                return node;
            }
        }
        return null;
    }

    public Node binFindNode(int index) { // получаем индекс элемента списка (ноды), который нужно получить
        Node node = head; // присваиваем текущему значению значение head списка (голова списка)
        for (int i = 0; i < index; i++){ // тупо перебираем все значения списка до нужного номера
            node = node.nextNode; // присваиваем текущее значение
            if (node == null){// если нода равна null
                return null;//значит ничего не нашли, значит такого индекса нет возвращаем null
            }
        }
        return node;//дошли до конца цикла, присвоили и возвратили значение ноды, соответствующей номеру индекса
    }

    public void addLastNode(int value){//добавление элемента в конец списка
        Node node = new Node();//создаем новую ноду
        node.value = value;//присваиваем ей значение
        if (tail == null){//если элементов в списке нет
            tail = node;//то текущая нода и есть хвост
            head = tail;//а заодно и голова
        }else{
            tail.nextNode = node;//говорим, что у текущего хвоста есть ссылка на следующий элемент - новую ноду
            node.previosNode = tail;//говорим, что у новой ноды предыдущий элемент - текущий хвост
            tail = node;//говорим что текущий хвост это новая нода
        }
    }

    public void addNode(int value, Node previosNode){//вводные данные - значение новой ноды, 
                                                    //и ссылка на предыдущую ноду, т.е. ноду, 
                                                    //после которой будем вставлять новый елемент
        Node node = new Node();                     //создаем новую ноду
        node.value = value;                         //присваиваем ей значение
        if (previosNode == null){                   //если элементов в списке нет
            head = node;
            tail = node;                            //то текущая нода есть голова и хвост списка
        }else{
            Node nextNode = previosNode.nextNode;   // говорим, что для новой ноды ссылка на следующую
                                                    // это ссылка на следующую у той ноды, после которой мы
                                                    //хотим вставить новую
            previosNode.nextNode = node;            //меняем ссылку предыдущей ноды на следующий элемент на новую ноду
            node.previosNode = previosNode;         //у новой ноды создаем ссылку на предыдущий элемент
            node.nextNode = nextNode;               // то же, на следующий элемент
            if (nextNode != null){
                nextNode.previosNode = node;        //у следующей ноды делаем ссылку на предыдущий элемент на новую ноду
            }else{
                tail = node;
            }         
        }
    }

    public void reverseList() {
        Node node = head;
        while (node != null) {
            Node temp = node.nextNode;
            node.nextNode = node.previosNode;
            node.previosNode = temp;
            node = temp;
        }
        Node temp = head;
        head = tail;
        tail = temp;
       }
       
}