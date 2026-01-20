// there are three ways to solve this problem but i will use the two pointer approach
// solution for valid palindrome in java https://leetcode.com/problems/valid-palindrome/
// time complexity O(n) = 0.059ms
// space complexity O(1)

class Solution {
    public boolean isPalindrome(String s) {
        int start = 0; // pointer 1 starting from beginning of the String 
        String string = s.toLowerCase(); // ensuring the string is in lower case
        string = string.replaceAll("[^a-z0-9]", ""); // removing all non alphanumeric characters
        
        for(int end = string.length() - 1; end>=0; end--){ // for loop starting end at the end of the String
            if(string.charAt(start) != string.charAt(end)){ // if start and end characters are not equal return false
                return false;
            }
                start++; // else increment start pointer
        } 
        return true; // if false is not thrown, the string is a palindrome and return true
    }
}

// second approch using a while loop, slightly slower but still O(n) time complexity
/* 
class Solution {
    public boolean isPalindrome(String s) {
        String string = s.toLowerCase();
        string = string.replaceAll("[^a-z0-9]", ""); 
        System.out.println(string);
        int start = 0;
        int end = string.length() - 1;
        while(start < end){ // while start pointer is less than end pointer 
           if(string.charAt(start) != string.charAt(end)){
                return false;
            }
            start++; // increment start pointer
            end--; // decrement end pointer
        }
        return true;
    }
}
*/

// lastly my third approach building a new string and comparing it to the reverse of itself
// not as effincinet as we can run into space complexity issues with very large strings
// and we dont check for nonalphanumeric characters
/*

static boolean isPalindrome(String s){
  String reverseWord = "";
  
  for(int i = s.length() - 1; i >= 0; i--){
      reverseWord += s.charAt(i);
  }
  if(s.equals(reverseWord)){
      return true;
  } else {
      return false;
  }
}
