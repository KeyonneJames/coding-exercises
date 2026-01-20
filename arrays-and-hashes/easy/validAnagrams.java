// solution for valid anagrams in java https://leetcode.com/problems/valid-anagram/
// time complexity O(n) = 0.131ms
// space complexity O(k) depending on number of unique characters, possible to be 0(n) in worst case

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        } // base case
        HashMap <Character, Integer> s1 = new HashMap<>(); // hash map for string s
        HashMap <Character, Integer> s2 = new HashMap<>(); // hash map for string t
        for(int i = 0; i < s.length(); i++){
            char curr1 = s.charAt(i);
            char curr2 = t.charAt(i);
            s1.put(curr1, s1.getOrDefault(curr1, 0) + 1); // add to hash map or update count
            s2.put(curr2, s2.getOrDefault(curr2, 0) + 1); // add to hash map or update count
            //using getOrDefault to get current count or 0 if not present
        }
        //System.out.println(s1); debugging tests
        //System.out.println(s2);
        if(s1.equals(s2)){
            return true;
        }
        return false;
    }
  }
