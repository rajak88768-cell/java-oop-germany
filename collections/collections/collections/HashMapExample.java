import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        map.put("Java", 1);
        map.put("Germany", 2);
        map.put("Internship", 3);

        System.out.println(map);

        System.out.println("Value for Java: " + map.get("Java"));

        map.remove("Germany");

        System.out.println("After removal: " + map);
    }
}
