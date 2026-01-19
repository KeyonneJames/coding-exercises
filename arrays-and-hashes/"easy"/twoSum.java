// solution for https://leetcode.com/problems/two-sum/ within o(1) time complexity
    public int[] twoSum(int[] nums, int target) {
        HashMap <Integer, Integer> complements = new HashMap<>();

        for(int i = 0; i < nums.length; i++){
            int needed = target - nums[i];
            if(complements.containsKey(needed)){
                return new int[] {complements.get(needed), i};
            } else {
                complements.put(nums[i], i);
            }
        }
        return new int[] {};
    }

