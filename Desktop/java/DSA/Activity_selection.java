import java.util.*;
// works for sorted input only
class greedy{
    public static void main(String args[]){
        int[] start={1,3,0,5,8,5};
        int[] end={2,4,6,7,9,9};
        int n = start.length;
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add( start[0]);
        int count=1;
        int lastend=end[0];
        for(int i=1;i<n;i++){
            if(start[i]>=lastend){
                count++;
                arr.add(start[i]);
                lastend = end[i];
            }
        }
        System.out.println(count);
    }
}
