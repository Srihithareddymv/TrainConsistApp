import java.util.*;
import java.util.stream.*;

public class UC8 {
    public static void main(String[] args) {
        List<Integer> caps = Arrays.asList(72, 56, 24, 70);

        List<Integer> result = caps.stream()
                .filter(c -> c > 60)
                .collect(Collectors.toList());

        System.out.println(result);
    }
}