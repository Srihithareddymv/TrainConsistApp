import java.util.*;

public class UC19 {
    public static void main(String[] args) {
        String[] a={"BG309","BG101","BG205"};

        Arrays.sort(a);

        int low=0,high=a.length-1;
        String key="BG205";

        boolean found=false;

        while(low<=high){
            int mid=(low+high)/2;
            int r=a[mid].compareTo(key);

            if(r==0){ found=true; break; }
            else if(r<0) low=mid+1;
            else high=mid-1;
        }

        System.out.println(found);
    }
}