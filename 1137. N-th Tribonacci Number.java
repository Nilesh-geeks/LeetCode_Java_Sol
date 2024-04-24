Question :: 1137. N-th Tribonacci Number

The Tribonacci sequence Tn is defined as follows: 

T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.

Given n, return the value of Tn.


Solution::

Complexity::

Time complexity:
O(N) 

Space complexity:
O(1)

Code::
class Solution {
    public int tribonacci(int n) {
           if(n==0)return 0;
        if(n==1 || n==2)return 1;
        int a = 0, b = 1 , c = 1;
        int sum = 0;
        for(int i=3 ; i<=n ; i++){
            sum = a + b + c;
            a= b;
            b = c;
            c = sum;

        }
        return sum;
    }
}