public class Optimised_tothe_pow_n {
    static int pow(int x , int n){
        if( n==0){
            return 1;
        }
       int half= pow(x,n/2)*pow(x,n/2);
       if(n%2!=0){
           half=x*half;
       }
       return half;
    }
    public static void main(String args[]){
       System.out.println( pow(2,10));
    }
}
