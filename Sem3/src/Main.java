// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Linlist list = new Linlist();

        list.addFirst(3);
        list.addFirst(7);
        list.addLast(1);
        list.print();
        System.out.println(" ");
        list.addLast(3);
        list.addLast(4);
        list.addFirst(55);
        list.print();
        System.out.println(" ");
        list.revert();
        list.print();
        System.out.println(" ");
        list.revert2();
        list.print();
        System.out.println(" ");
        list.removeFirst();
        list.print();
        System.out.println(" ");
        list.removeLast();
        list.print();
        System.out.println(" ");
        list.revert();
        list.print();
        list.contains(7);
    }
}