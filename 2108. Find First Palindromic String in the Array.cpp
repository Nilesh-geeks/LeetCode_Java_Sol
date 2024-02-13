Question :: 2108. Find First Palindromic String in the Array

Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".

A string is palindromic if it reads the same forward and backward.
Solution::

Complexity::

Time complexity:
O(N*s) , s = length of max string

Space complexity:
O(1)
Code
class Solution {
    public String firstPalindrome(String[] words) {
           for ( String s:words){
               if(check(s))return s;
           }   
           return "";
    }
    public Boolean check(String s){
        int n = s.length();
        for(int i=0 ; i<n/2;i++){
            if(s.charAt(i) != s.charAt(n-i-1))return false;
        }
        return true;
    }
}