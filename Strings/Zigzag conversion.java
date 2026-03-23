package Strings;
class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1) return s;
        StringBuilder[] sb=new StringBuilder[numRows];
        for(int i=0;i<numRows;i++){
            sb[i]=new StringBuilder();
        }
        boolean flag=false;
        int k=0;
        for(int i=0;i<s.length();i++){
            sb[k].append(s.charAt(i));
            if(k==0) flag=true;
            else if(k==numRows-1) flag=false;
            if(flag) k++;
            else k--;
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<numRows;i++){
            res.append(sb[i]);
        }
        return res.toString();
    }
}
