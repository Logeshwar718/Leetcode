class Solution {
    public int addDigits(int num) {
        while(num>9){
            int res=0;
            while(num>0){
                int last=num%10;
                res+=last;
                num/=10;
            }
            num=res;
        }
        return num;
    }
}