Question :: 2000. Reverse Prefix of Word

Given a 0-indexed string word and a character ch, reverse the segment of word that starts at index 0 and ends at the index of the first occurrence of ch (inclusive). If the character ch does not exist in word, do nothing.

For example, if word = "abcdefd" and ch = "d", then you should reverse the segment that starts at 0 and ends at 3 (inclusive). The resulting string will be "dcbaefd".
Return the resulting string.
Solution::

Complexity::

Time complexity:
O(N) 

Space complexity:
O(1)

Code::
class Solution {
    public String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        if(index == -1)return word;
        StringBuilder s = new StringBuilder(word.substring(0, index+1)).reverse();
        if(index < word.length()){
                s.append(word.substring(index+1));
        }
        return s.toString();
    }
}