import java.util.*;

public class UC13 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 1000; i++) list.add(i);

        long start = System.nanoTime();
        list.stream().filter(x -> x > 500).count();
        long end = System.nanoTime();

        System.out.println("Time: " + (end - start));
    }
}