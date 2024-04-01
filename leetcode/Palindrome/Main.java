package leetcode.Palindrome;

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        };
        String num_str = Integer.toString(x);
        int length = num_str.length();
        int i = 0;
        while (i < length) {
            if (num_str.charAt(i) != num_str.charAt(length - i - 1)) {
                return false;
            }
            i++;
        }
        return true;
    }
}