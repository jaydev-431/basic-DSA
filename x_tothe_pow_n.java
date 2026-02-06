public class x_tothe_pow_n {
    static int pow(int x , int n){
        if(n==1 || n==0){
            return x;
        }
        return x*pow(x,n-1);
    }
    public static void main(String args[]){
       System.out.println( pow(2,10));
    }
}
