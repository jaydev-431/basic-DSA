class Main {

    static int lastOccurrence(int[] nums, int key, int i) {
        // base case
        if (i == nums.length) {
            return -1;
        }

        // search in remaining array
        int idx = lastOccurrence(nums, key, i + 1);

        // if found later, return it
        if (idx != -1) {
            return idx;
        }

        // check current index
        if (nums[i] == key) {
            return i;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 4, 6};
        int key = 4;
        System.out.println(lastOccurrence(nums, key, 0));
    }
}


