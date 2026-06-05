class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> map = new HashMap<>();
        for (String s: strs){
            int[] chars = new int[26];
            for(int i=0;i<s.length();i++){
                chars[s.charAt(i)-'a']++;
            }
            String key = Arrays.toString(chars);
            if(map.containsKey(key)){
                map.get(key).add(s);
            }
            else{
                map.put(key, new ArrayList<> (List.of(s)));
            }
        }
        return new ArrayList<>(map.values());
    }
}
