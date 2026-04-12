import java.util.regex.*;

public class UC11 {
    public static void main(String[] args) {
        String trainId = "TRN-1234";

        Pattern p = Pattern.compile("TRN-\\d{4}");
        Matcher m = p.matcher(trainId);

        System.out.println("Valid? " + m.matches());
    }
}