class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }

        List<Integer> list = new ArrayList<>(map.keySet());

        // sort list based on frequency in descending order
        Collections.sort(list, (a,b) -> map.get(b) - map.get(a));

        int res[] = new int[k];

        for(int i=0; i<k; i++){
            res[i] = list.get(i);
        }

        return res;
    }
}
