// solution for https://leetcode.com/problems/remove-element/ in java
// time complexity: O(n)
// space complexity: O(1)
// could also create a new array to store the result, but that would use O(n) space
// instead, we modify the input array in place and use a pointer to track the position of the next valid element
    public int removeElement(int[] nums, int val) {
        //int[] newArr = new int[];
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == val){
                continue;
            }
            if(nums[i]!=val){
                nums[k++] = nums[i];
            }
        }
        return k;
    }
