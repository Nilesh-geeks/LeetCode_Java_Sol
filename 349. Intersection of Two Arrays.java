Question ::349. Intersection of Two Arrays

Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.
 
 
Solution::

Complexity::

Time complexity:
O(N) 

Space complexity:
O(N)

Code::

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map<Integer , Integer>m = new HashMap<>();
        for(int num:nums1){
            m.put(num , m.getOrDefault(num ,0)+1);
        }
        List<Integer>result = new ArrayList<>();
         for(int n : nums2){
             if(m.containsKey(n)){
                 result.add(n);
                 m.remove(n);
             }
         }
        int res[] = new int[result.size()];
         for(int i =0 ; i< result.size() ; i++){
             res[i] = result.get(i);
         }
         return res;
    }
}