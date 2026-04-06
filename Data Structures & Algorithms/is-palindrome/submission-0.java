class Solution {

    public boolean palindrome(StringBuilder sb){
        int start = 0;
        int end = sb.length()-1;

        while(start < end){
            if(sb.charAt(start) != sb.charAt(end)){
                return false;
            }

            start++;
            end--;
        } 
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);

            if(Character.isLetterOrDigit(ch)){
                sb.append(Character.toLowerCase(ch));
            }
        }

        if(palindrome(sb)) return true;

        return false;
    }
}
