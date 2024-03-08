Question :: 3005. Count Elements With Maximum Frequency

You are given an array nums consisting of positive integers.

Return the total frequencies of elements in nums such that those elements all have the maximum frequency.

The frequency of an element is the number of occurrences of that element in the array.
Solution::

Complexity::

Time complexity:
O(N) 

Space complexity:
O(N)

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer , Integer>map = new HashMap<>();
        for(int val : nums){
            map.put(val,map.getOrDefault(val,0)+1);
        }
        int cnt =0 ;
        int max =0 ;
        for(int f : map.values()){
            max = Math.max(max ,f);
        }
           for(int f : map.values()){
            if(f == max){
                cnt += f;
            }
        }
        return cnt;
    }
}