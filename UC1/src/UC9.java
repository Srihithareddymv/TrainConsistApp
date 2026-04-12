import java.util.*;
import java.util.stream.*;

public class UC9 {
    public static void main(String[] args) {
        List<String> bogies = Arrays.asList("Sleeper", "AC", "Sleeper");

        Map<String, List<String>> map =
                bogies.stream().collect(Collectors.groupingBy(b -> b));

        System.out.println(map);
    }
}