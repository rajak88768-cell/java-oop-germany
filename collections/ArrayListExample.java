import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        list.add("Java");
        list.add("Germany");
        list.add("Internship");

        System.out.println(list);
        System.out.println("First element: " + list.get(0));

        list.remove("Germany");
        System.out.println("After removal: " + list);
    }
}
