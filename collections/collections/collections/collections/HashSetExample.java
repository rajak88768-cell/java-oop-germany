import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet<String> set = new HashSet<>();

        set.add("Java");
        set.add("Germany");
        set.add("Internship");
        set.add("Java"); // duplicate

        System.out.println(set);

        System.out.println("Contains Java? " + set.contains("Java"));

        set.remove("Germany");

        System.out.println("After removal: " + set);
    }
}
