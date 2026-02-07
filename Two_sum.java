public class Two_sum {
     public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        for (int i=0;i<n;i++){
                int need = target-nums[i];
                for(int j=i+1;j<n;j++){
                    if(need==nums[j]){
                        return new int[]{i,j};
                    }
                }
        }
        return new int[]{};
    }
}
