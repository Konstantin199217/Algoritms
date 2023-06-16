public class Linlist {
    private Node head;

    public void addFirst(int value) {
        Node node = new Node(); //Создали ноду
        node.value = value;
        if (head != null) {// если не пустой список
            node.next = head;// в ссылку на следующую ноду записываем нынешнее число
        }
        head = node;// в главную ноду пишем текущую
    }

    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
        } else {
            Node last = head;
            while (last.next != null) {
                last = last.next;
            }
            last.next = node;
        }
    }

    public void print() {
        if (head == null) {
            System.out.println("Список пуст");
            return;
        }
        Node node = head;
        while (node != null) {
            System.out.print(node.value + " -> ");
            node = node.next;
        }
    }


    private class Node {
        private int value;
        private Node next;
    }


    //Удаление первого элемента
    public void removeFirst() {
        if (head == null) {
            System.out.println("нельзя удалить - пустой список");
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (head == null) {
            System.out.println("Список пуст");
        } else {
            Node node = head;
            while (node.next != null) {
                if (node.next.next == null) {
                    node.next = null;
                    return;
                }
                node = node.next;
            }
            head = null;
        }
    }

    //метод проверки наличия по списку
    public boolean contains(int value_isk) {
        Node node = head;
        int index = 0;
        while (node != null) {
            if (node.value == value_isk) {
                System.out.println("Индекс "+ index);
                return true;
            }
            node = node.next;
            index++;
        }
        return false;
    }

    public void revert() {
        if (head != null && head.next != null) {
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }
    private void revert(Node currentNode, Node previousNode) {
        if (currentNode.next == null) {
            head = currentNode;
        } else {
            revert(currentNode.next, currentNode);
        }
        currentNode.next = previousNode;
        previousNode.next = null;
    }

    public void revert2(){
        if (head != null && head.next != null) {
            Node revers = null;
            Node curr = head;
            while (curr != null){
                Node next = curr.next;
                curr.next = revers;
                revers = curr;
                curr = next;
            }
            head = revers;
        }
    }

}
