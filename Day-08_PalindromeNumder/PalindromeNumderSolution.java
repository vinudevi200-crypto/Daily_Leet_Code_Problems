PalindromeNumderSolution.java

class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int ori=x;
        int new_str=0;
        while(x!=0){
            int digit=x%10;
            new_str=new_str*10+digit;
            x=x/10;
        }
        if(ori==new_str){
            return true;
        }
        return  false;
    }
}
