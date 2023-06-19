import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Tree {

    Node root;

    //В глубину
//
//    public boolean exist(int value){
//        if (root != null) {
//            Node node = find(root, value);
//            if (node != null) {
//                return true;
//            }
//        }return false;
//    }
//    private Node find(Node node, int value){
//        if (node.value == value){
//            return node;
//        }else {
//            for(Node child : node.children){
//                Node result = find(child, value);
//                if (result != null){
//                    return result;
//                }
//            }
//        }
//        return null;
//    }
//


    // В ширину
    private Node find(int value) {
        List<Node> line = new ArrayList<>();
        line.add(root);
        while (line.size() > 0) {
            List<Node> nextLine = new ArrayList<>();
            for (Node node : line) {
                if (node.value == value) {
                    return node;
                }
                nextLine.addAll(node.children);
            }
            line = nextLine;
        }
        return null;
    }



    public class Node {
        int value;
        List<Node> children;
    }
}