// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Recursion {
    static int found(int [] nums,int key,int i){
        if(key==nums[i]){
            return 1;
        }
        if(key==nums.length){
            return -1;
        }
        return found(nums,key,i+1);
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6};
        int key = 4;
        System.out.println(found(nums, key,0));
        // System.out.println("Try programiz.pro");
    }
}