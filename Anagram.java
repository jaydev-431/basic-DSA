
import java.util.*;
class SortString{
    public static void main(String args[]){
        String v1 = "jaydev";
        String v2 = "yjadev";
        char[] V1 = v1.toCharArray();
        char[] V2 = v2.toCharArray();
        Arrays.sort(V1);
        Arrays.sort(V2);
        String uv1= new String(V1);
        String uv2 = new String(V2);
        if(uv1.equals (uv2)){
            System.out.println("Anagram");
        }
        else{
             System.out.println("Not Anagram");
        }
    }
}