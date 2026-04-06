class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int right = 0;
        Set<Character> set = new HashSet<>();
        int longest = 0;

        while(right < s.length()){
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }

            longest = Math.max(longest, right-left+1);
            set.add(s.charAt(right));
            right++;
        }

        return longest;
    }
}
