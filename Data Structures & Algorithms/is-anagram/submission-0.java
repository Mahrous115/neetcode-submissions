class Solution {
      public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] list1 = new char[s.length()];
        char[] list2 = new char[t.length()];
        for (int i=0;i<s.length();i++){
            list1[i]=s.charAt(i);
            list2[i]=t.charAt(i);
        }
        Arrays.sort(list1);
        Arrays.sort(list2);
            if (Arrays.equals(list1, list2)){
                return true;

        }
        return false;
    }
}

