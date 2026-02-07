public class Set_bit_at_ithpos {
    static void Clear_ith_bit(int n,int i){
        int bitmask = ~(1<<i);
        int r = bitmask&n;
        System.out.println(r);
    }
    public static void main(String args[]){
        int n=15;
        int i=2;
        int bitmask = 1<<i;
        int r = bitmask|n;
        System.out.println(r);
        Clear_ith_bit(n,i);
    }
}
