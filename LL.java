import java.util.LinkedList;
import java.util.Collections;

public class LL {
    public static void main(String args[]) {
        LinkedList<Integer> list = new LinkedList<>();

        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        list.addLast(7);
        list.addLast(8);
        System.out.println("list before applying operations" + list);

        int k = 3;

        for (int i = 0; i + k <= list.size(); i += k) {
            Collections.reverse(list.subList(i, i + k));
        }
        System.out.println(list);
    }
}