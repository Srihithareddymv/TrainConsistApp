class InvalidCapacityException extends Exception {
    InvalidCapacityException(String msg) {
        super(msg);
    }
}

class PB {
    PB(int c) throws InvalidCapacityException {
        if (c <= 0) throw new InvalidCapacityException("Invalid");
    }
}

public class UC14 {
    public static void main(String[] args) {
        try {
            new PB(0);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}