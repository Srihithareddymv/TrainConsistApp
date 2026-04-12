import java.util.*;

public class UC10 {
    public static void main(String[] args) {
        List<Integer> caps = Arrays.asList(72, 56, 24);

        int total = caps.stream()
                .map(c -> c)
                .reduce(0, Integer::sum);

        System.out.println("Total: " + total);
    }
}