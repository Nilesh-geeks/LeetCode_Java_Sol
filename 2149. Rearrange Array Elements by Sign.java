Question :: 2149. Rearrange Array Elements by Sign

You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

You should rearrange the elements of nums such that the modified array follows the given conditions:

Every consecutive pair of integers have opposite signs.
For all integers with the same sign, the order in which they were present in nums is preserved.
The rearranged array begins with a positive integer.
Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

 
Solution::

Complexity::

Time complexity:
O(N) 

Space complexity:
O(N)

Code::
class Solution {
    public int[] rearrangeArray(int[] nums) {
        int pos =0 ;
        int neg = 1;
        int []ans = new int[nums.length];
        for(int i=0 ; i<nums.length ; i++){
            if(nums[i]>0){
                    ans[pos] = nums[i];
                    pos+=2;
            }
            else {
                ans [ neg] =nums[i];
                neg +=2;
            }
        }
        return ans;
    }
}