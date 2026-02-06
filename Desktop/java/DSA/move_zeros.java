import java.util.*;
 class Move_zeros {
    // import java.util.*;
    public static void main(String[] args) {
		int[] arr = {0,1,5,0,12,0,9};
		int i,count=0;
		for(i=0; i<arr.length; i++) {
			if(arr[i]!=0 ) {
				arr[count]=arr[i];
				count++;
			}
		}
		while(count<arr.length) {
			arr[count]=0;
			count++;
		}
		for(i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
