public class Get_ith_bit {
    public static void main(String args[]){
        int n=15;
        int ith_position = 2;
        int bit = (n&(1<<ith_position));
        System.out.println(bit!=0 ? "1":"0");
    }
}
