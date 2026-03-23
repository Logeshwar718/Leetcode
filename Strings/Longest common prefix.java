package Strings;
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        for(int i=1;i<strs.length;i++){
            StringBuilder common=new StringBuilder("");
            int j=0;
            while(j<strs[i].length() && j<res.length()){
                if(strs[i].charAt(j)==res.charAt(j)){
                    common.append(res.charAt(j));
                    j++;
                }
                else break;
            }
            res=common.toString();
        }
        return res;
    }
}
