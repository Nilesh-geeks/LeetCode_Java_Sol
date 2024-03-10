Question ::2540. Minimum Common Value

Given two integer arrays nums1 and nums2, sorted in non-decreasing order, return the minimum integer common to both arrays. If there is no common integer amongst nums1 and nums2, return -1.

Note that an integer is said to be common to nums1 and nums2 if both arrays have at least one occurrence of that integer.

 
Solution::

Complexity::

Time complexity:
O(N) 

Space complexity:
O(N)

class Solution {
    public int getCommon(int[] nums1, int[] nums2) {
        int i=0 ; 
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j])return nums1[i];

            if(nums1[i]>nums2[j])j++;
            else i++;
        }
        return -1;
    }
}