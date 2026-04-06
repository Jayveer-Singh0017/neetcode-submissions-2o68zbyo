class Solution {
    public boolean isAnagram(String s, String t) {

        int freqS[] = new int[26];
        int freqT[] = new int[26];

        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            freqS[ch-'a']++;
        }

        for(int i=0; i<t.length(); i++){
            char ch = t.charAt(i);
            freqT[ch-'a']++;
        }

        for(int i=0; i<26; i++){
            if(freqS[i] != freqT[i]) return false;
        }

        return true;

        // HashMap<Character,Integer> sMap = new HashMap<>();
        // HashMap<Character,Integer> tMap = new HashMap<>();
        
        // for(char ch : s.toCharArray()){
        //     sMap.put(ch, sMap.getOrDefault(ch,0)+1);
        // }

        // for(char ch : t.toCharArray()){
        //     tMap.put(ch, tMap.getOrDefault(ch,0)+1);
        // }

        // for(char key : sMap.keySet()){
        //     if(sMap.get(key) != tMap.get(key)) return false;
        // }

        // return true;
    }
}
