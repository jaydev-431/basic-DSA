public class bitwise {
    public static void main(String args[]){
    int a=5,b=6;
    int and = a & b;
    int or = a | b;
    int Xor = a ^ b;
    int not_a = ~2 ;
    int not_b= ~b;
    int leftshift = a << 2;
    int rightshift = 5 >> 2;
    System.out.println("AND: "+and);
    System.out.println("OR: "+or);
    System.out.println("XOR: "+Xor);
    System.out.println("NOT_a: "+not_a);
    System.out.println("NOT_b: "+not_b);
    System.out.println("LEFT SHIFT: "+leftshift);
    System.out.println("RIGHT SHIFT: "+rightshift);
    }
}
