public class subarray {
    public static void main(String[] args) {
     int arr[] = {1,2,3,4,5};
     int n=arr.length;
     int i,j,k;
     for(i=0;i<n-1;i++){
        for (j=i;j<n;j++){
            // System.out.print(arr[j]);
            for(k=j;k<=j;k++){
                System.out.print(arr[k]);
            }
            System.out.println();
        }
     }   
    }
}
