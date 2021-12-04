import java.util.Arrays;
import java.util.LinkedList;

//Finding Middle element of linked list in one pass
public class MiddleOfLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<Integer>(Arrays.asList(0, 1, 2, 3, 4));
        System.out.println(getMiddleOfLinkedList(linkedList));
    }

    public static <T> T getMiddleOfLinkedList(LinkedList<T> linkedList) {
        return linkedList.get(linkedList.size() / 2);
    }
}
