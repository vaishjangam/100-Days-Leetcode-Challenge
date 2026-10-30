class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int l = 0;
        int r = s.length()-1;

        while(l < r){
            while(l < r && !isAlphabet(s.charAt(l))){
                l++;
            } 

            while(l < r && !isAlphabet(s.charAt(r))){
                r--;
            }
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
            l++;
            r--;
            
        }
         return true; 

    }

    public boolean isAlphabet(char s){
     
        
            if(s >= 'a' && s <= 'z' || s >='0' && s <= '9'){
                return true;
            }
        
    return false;

    }

}