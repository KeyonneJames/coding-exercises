# solution for https://leetcode.com/problems/remove-element/ in python
# time complexity: O(n)
# space complexity: O(1)
# python allows us to directly pop elements from the list, but that would be less efficient
# instead, we modify the input list in place and use a pointer to track the position of the next valid element

class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        k = 0
        for i in range(len(nums)):
            if nums[i] != val:
                nums[k] = nums[i]
                k += 1  
        return k