public class UC18 {
    public static void main(String[] args) {
        String[] a={"BG101","BG205"};

        String key="BG205";
        boolean f=false;

        for(String x:a)
            if(x.equals(key)) f=true;

        System.out.println(f);
    }
}