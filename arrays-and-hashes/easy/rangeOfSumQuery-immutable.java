// solution for https://leetcode.com/problems/range-sum-query-immutable/
// runtime 7ms - time complexity: O(n) for constructor, O(1) for sumRange
// // space complexity: O(n) for prefix sum array

class NumArray {
private int[] prefix; 

    public NumArray(int[] nums) {
        int n = nums.length;
        this.prefix = new int[n];
        prefix[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            prefix[i] = prefix[i - 1] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        if(left == 0){
            return prefix[right]; // if left is 0, just return prefix at right
        }
            return prefix[right] - prefix[left - 1]; // else return prefix at right - prefix at left - 1
    }
}
