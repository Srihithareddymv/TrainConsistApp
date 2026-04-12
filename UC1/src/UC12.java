import java.util.*;

class Goods {
    String type, cargo;

    Goods(String t, String c) {
        type = t;
        cargo = c;
    }
}

public class UC12 {
    public static void main(String[] args) {
        List<Goods> list = Arrays.asList(
                new Goods("Cylindrical", "Petroleum"),
                new Goods("Rectangular", "Coal")
        );

        boolean safe = list.stream()
                .allMatch(g -> !(g.type.equals("Cylindrical") && !g.cargo.equals("Petroleum")));

        System.out.println("Safe? " + safe);
    }
}