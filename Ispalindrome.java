import java.util.*;

public class Ispalindrome {
// leetcode 125
    public static void  main(String[] args) {
    
        // boolean is ;
        String s = " A man, a plan, a canal: Panama";
        int f = 0 , l = s.length()-1;
        while(f<l){
            if(!Character.isLetterOrDigit(s.charAt(f))){
                f++;
                continue;
            }
            if(!Character.isLetterOrDigit(s.charAt(l))){
                l--;
                continue;
            }
             if(Character.toLowerCase(s.charAt(f))!=Character.toLowerCase(s.charAt(l))){
                // is = false;
                System.out.println(false);
                return  ;
            }
            f++;l--;
        }
        // is =true ;
       
    System.out.println(true);
    return ;

        
        
    }

}
