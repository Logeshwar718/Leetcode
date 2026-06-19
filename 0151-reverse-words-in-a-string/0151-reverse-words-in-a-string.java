class Solution {
    public String reverseWords(String s) {
        int i=s.length()-1;
        StringBuilder res=new StringBuilder();
        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;
            int end=i;
            if(i<0) break;
            while(i>=0 && s.charAt(i)!=' ') i--;
            int start=i+1;
            for(int k=start;k<=end;k++){
                res.append(s.charAt(k));
            }
            res.append(' ');
        }
        res.deleteCharAt(res.length()-1);
        return res.toString();
    }
}