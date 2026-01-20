// solution for removing duplicates from a sorted array in java using two pointers
// leetcode problem: https://leetcode.com/problems/remove-duplicates-from-sorted-array/

// time complexity: O(n)
// space complexity: O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 1; i < nums.length; i++){
            int curr = nums[i]; // current element which we are comparing to the prev
            int prev = nums[i - 1]; // since i starts from 1, prev will be at i-1 which is the previous element
            if(curr != prev){ // if curr is not equal to prev, it means it's a unique element
                nums[k++] = curr; // set the value at index k to curr and post increment k
            }
        }
        return k;
    }
}