public class UC20 {
    public static boolean search(String[] a,String key){
        if(a.length==0)
            throw new IllegalStateException("Empty");

        for(String x:a)
            if(x.equals(key)) return true;

        return false;
    }

    public static void main(String[] args){
        try{
            search(new String[]{}, "BG101");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}