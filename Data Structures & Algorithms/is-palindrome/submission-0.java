class Solution {
     public boolean isPalindrome(String s) {
        char[] list = new char[s.length()];
        int size = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))) {
                list[size] = Character.toLowerCase(s.charAt(i));
                size++;
            }
        }
        int ptr = size-1;
        for (int i = 0; i < size/2; i++) {
            if (list[i] != list[ptr]) {
                return false;
            }
            ptr--;
        }
        return true;
    }
}
