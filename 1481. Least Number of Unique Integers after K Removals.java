Question :: 1481. Least Number of Unique Integers after K Removals
Given an array of integers arr and an integer k. Find the least number of unique integers after removing exactly k elements.
 
Solution::

Complexity::

Time complexity:
O(N) 

Space complexity:
O(N)

Code::
class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer , Integer>m = new HashMap<>();
        for(int a:arr)m.put(a ,m.getOrDefault(a,0)+1 );
        List<Integer>v = new ArrayList<>();
        int cnt =0 ;
        for(int a:m.values()){
            v.add(a);
        }
        Collections.sort(v);
        for(int i=0 ; i<v.size() ;i++){
            if(k>v.get(i)){
                k -= v.get(i);
                v.set(i,0);
            }
            else{
            v.set(i, v.get(i) - k);
                k = 0;
            }
            if (v.get(i) != 0) cnt++;
        }
        return cnt;
    }
}