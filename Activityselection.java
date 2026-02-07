import java.util.*;

public class Activityselection {
    // works for unsorted input
    public static void main(String args[]){
        int[] start={1,3,0,5,8,5};
        int[] end={9,4,6,7,9,9};
        int n = start.length;
        int lastend,count=1;
        int[][] act = new int[start.length][3];
        for (int i=0;i<n;i++){
            act[i][0]=i;
            act[i][1]=start[i];
            act[i][2]=end[i];
        }
        Arrays.sort(act,Comparator.comparingDouble(o->o[2]));
        lastend = act[0][2];
        for (int i=1;i<n;i++){
            if(act[i][1]>=lastend){
                count++;
                lastend = act[i][2];
            }
        }
        System.out.println(count);
    }
}
