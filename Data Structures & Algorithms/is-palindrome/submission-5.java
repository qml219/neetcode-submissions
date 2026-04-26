class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int i = 0;
        int j = n - 1;
        while (i < j) {
            while (!Character.isLetterOrDigit(s.charAt(i))) {
                if (i == j) {
                    return true;
                }
                i++;
            }
            while (!Character.isLetterOrDigit(s.charAt(j))) {
                if (i == j) {
                    return true;
                }
                j--;
            }
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            } else {
                i++;
                j--;
            }
        }
        return true;
    }
}
