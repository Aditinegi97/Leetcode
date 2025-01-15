class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0 || strs == null)
        {
            return "";
        }
        Arrays.sort(strs);
        int n = strs.length;
        String str1 = strs[0];
        String str2 = strs[n-1];
        int index = 0;
        while (index<str1.length() && index < str2.length() && str1.charAt(index)== str2.charAt(index))
        {
            index++;
        }
        return (str1.substring(0, index));   
    }
}

    