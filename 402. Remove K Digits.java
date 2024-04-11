Question :: 402. Remove K Digits

Given string num representing a non-negative integer num, and an integer k, return the smallest possible integer after removing k digits from num.


Example 1:

Input: num = "1432219", k = 3
Output: "1219"
Explanation: Remove the three digits 4, 3, and 2 to form the new number 1219 which is the smallest.
Example 2:

Input: num = "10200", k = 1
Output: "200"
Explanation: Remove the leading 1 and the number is 200. Note that the output must not contain leading zeroes.
Example 3:

Input: num = "10", k = 2
Output: "0"
Explanation: Remove all the digits from the number and it is left with nothing which is 0.
Solution::

Complexity::

Time complexity:
O(N) 

Space complexity:
O(1)

Code::
class Solution {
    public String removeKdigits(String num, int k) {
        
        Stack<Character>st = new Stack<>();
        for(char c:num.toCharArray()){
            while(!st.isEmpty() && k>0 && st.peek()>c){
                st.pop();
                k--;
            }
            if(!st.isEmpty() || c!='0')st.push(c);
        }
        while(!st.isEmpty() && k>0){
            st.pop();
            k--;
        }
        if(st.isEmpty())return "0";
        StringBuilder s=  new StringBuilder() ;
        while(!st.isEmpty()){
            s.append(st.pop());
        }
        s.reverse();
        return s.toString();
    }
}