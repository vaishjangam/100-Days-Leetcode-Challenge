class Solution {
    public boolean isPalindrome(int x) {
        int n = x;

        if( x < 0){
            return false;
        }
        int revNum = 0;
        while( n > 0){
            int dig = n % 10;
            revNum = revNum*10 + dig;
            n = n / 10;
        }

        if(revNum == x){
            return true;
        }else{
            return false;
        }
        
    }
}