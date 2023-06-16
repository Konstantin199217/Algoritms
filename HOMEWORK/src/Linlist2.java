public class Linlist2 {
    Node head;

    Node tail;

    public void addFirst(int value) {
        Node temp = new Node();
        temp.value = value;
        if (head == null) {
            tail = temp;
            head = temp;
        } else {
            head.previous = temp;
            temp.next = head;
            head = temp;
        }
    }

    public void addLast(int value) {
        Node node = new Node();
        node.value = value;
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            node.previous = tail;
            tail = node;
        }
    }


    public void removeFirst() {
        if (head == tail) {
            head = null;
            tail = null;
        }
        if (head != null) {
            Node temp = head;
            head = temp.next;
            temp.previous = null;
        }
    }

    public void removeLast() {
        if (head.next == null){
            head = null;
            System.out.println("Список пуст");
        }
        if (tail.next == null) {
            tail.previous.next = null;
            tail = tail.previous;
    }

}

    public void revert() {
        Node currentNode = head;
        while (currentNode != null) {
            Node next = currentNode.next;
            Node previous = currentNode.previous;
            currentNode.next = previous;
            currentNode.previous = next;
            if (previous == null) {
                tail = currentNode;
            }
            if (next == null) {
                head = currentNode;
            }
            currentNode = next;

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

public class Node {
    int value;
    Node next;

    Node previous;
}
}

