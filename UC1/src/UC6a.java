import java.util.*;

public class UC6a {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("Sleeper", 72);
        map.put("AC  Chair", 56);
        map.put("First Class", 24);

        for (Map.Entry<String, Integer> e : map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}