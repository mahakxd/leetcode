class Solution {
    public boolean isHappy(int n) {
        int temp=n;
        do{
            int dig,sum=0;
            while(n>0){
                dig=n%10;
                sum=sum+dig*dig;
                n=n/10;
            }
            n=sum;
        }while(n>6 && n!=temp);
        if(n==1){
            return true;
        }
        return false;
    }
}