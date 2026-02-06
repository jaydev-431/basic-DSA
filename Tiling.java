public class Tiling {
    static int tiling( int n){
        if( n==1||n==0){
            return 1;
        }
        int vertical = tiling(n-1);
        int horizantal = tiling(n-2);
        int total =  vertical+horizantal ;
       return total;
    }
    public static void main(String args[]){
       System.out.println( tiling(3));
    }
}
