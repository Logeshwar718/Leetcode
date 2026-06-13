class Solution {
    public String longestCommonPrefix(String[] strs) {
        String res=strs[0];
        for(int i=1;i<strs.length;i++){
            String common="";
            int k=0;
            while(k<res.length() && k<strs[i].length()){
                if(res.charAt(k)==strs[i].charAt(k)){
                    common+=res.charAt(k);
                    k++;
                }
                else break;
            }
            res=common;
        }
        return res;
    }
}