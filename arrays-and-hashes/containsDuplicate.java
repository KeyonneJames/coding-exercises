// solution for containsDuplicate in o(1) time complexity
    public boolean hasDuplicate(int[] nums) {
        HashMap <Integer, Integer> storeNumbers = new HashMap<>(); //create hash map
        
        for(int i = 0; i < nums.length; i++){
            if(storeNumbers.containsKey(nums[i])){ // if hashmap has the number(duplicate), return true
                return true;
            }else{
                storeNumbers.put(nums[i], i); // else add it to the hashmap
            }
        }
        return false;
    }