// solution for https://leetcode.com/problems/concatenation-of-array/ in Java, 
// time complexity O(n) and space complexity O(n)
    public int[] getConcatenation(int[] nums) {
        int n = 2 * nums.length;
        int[] ans = new int[n]; // set ans array to size of 2n
            for(int i = 0; i < nums.length; i++){
                ans[i] = nums[i]; // fill in first half
                ans[i + nums.length] = nums[i]; // fill in second half
        }
        return ans;
    }