import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Berlin");
        list.add("Internship");

        System.out.println(list);

        list.addFirst("Start");
        list.addLast("End");

        System.out.println("After adding first & last: " + list);

        list.remove("Berlin");

        System.out.println("After removal: " + list);
    }
}
