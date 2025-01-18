class Solution {
    public boolean isPalindrome(String s) {
        String s2 = s.replaceAll("[^a-zA-Z0-9]", "");
        String S = s2.toLowerCase();
        int i =0;
        int j = S.length()-1;
        while(i<j)
        {
            if(S.charAt(i) != S.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}