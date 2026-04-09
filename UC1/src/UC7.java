import java.util.*;

class Bogie {
    String name;
    int capacity;

    Bogie(String n, int c) {
        name = n;
        capacity = c;
    }

    public String toString() {
        return name + ":" + capacity;
    }
}

public class UC7 {
    public static void main(String[] args) {
        List<Bogie> list = new ArrayList<>();

        list.add(new Bogie("Sleeper", 72));
        list.add(new Bogie("AC Chair", 56));
        list.add(new Bogie("First Class", 24));

        list.sort(Comparator.comparingInt(b -> b.capacity));

        System.out.println(list);
    }
}