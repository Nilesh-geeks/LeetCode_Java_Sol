Question ::881. Boats to Save People
You are given an array people where people[i] is the weight of the ith person, and an infinite number of boats where each boat can carry a maximum weight of limit. Each boat carries at most two people at the same time, provided the sum of the weight of those people is at most limit.

Return the minimum number of boats to carry every given person.

 

Example 1:

Input: people = [1,2], limit = 3
Output: 1
Explanation: 1 boat (1, 2)
Example 2:

Input: people = [3,2,2,1], limit = 3
Output: 3
Explanation: 3 boats (1, 2), (2) and (3)
Example 3:

Input: people = [3,5,3,4], limit = 5
Output: 4
Explanation: 4 boats (3), (3), (4), (5)
Solution::

Complexity::

Time complexity:
O(N) , When using Count Sort , O(N * log N) When using Normal Sort

Space complexity:
O(N), when using Count sort  AND O(1) when using normal sort

Code::
class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int count[] = new int[limit+1];
        for(int i:people)count[i]++;
        int idx =0;
        for(int i = 0 ; i<=limit ; i++){
            while(count[i]-->0)people[idx++] =i;
        }
        int cnt =0;
        int left =0 , right = people.length-1;
        while(left<=right){
            if(people[left]+ people[right]<=limit){
                left++;
                right--;
            }
            else
                 right--;
            cnt++;
        }
        return cnt;
    }
}