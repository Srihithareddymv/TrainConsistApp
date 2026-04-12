class CargoSafetyException extends RuntimeException {
    CargoSafetyException(String m) { super(m); }
}

public class UC15 {
    public static void main(String[] args) {
        try {
            throw new CargoSafetyException("Unsafe");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Done");
        }
    }
}