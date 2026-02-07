// Online Java Compiler
// Use this editor to write, compile and run your Java code online
// import java.util.*;
class Solution {
    public int findMin(int n) {
        // System.out.println("Try programiz.pro");
        // Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int count=0;
        // output=13
        while(n>0){
            if(n>=10){
                n=n-10;
            }
            else if(n<10 && n>=5){
                n=n-5;
            }
            else if(n>=2 && n<5){
                n=n-2;
            }
            else{
                n=n-1;
            }
            count++;
        }
        // System.out.println(count);
        return count ;
    }
}