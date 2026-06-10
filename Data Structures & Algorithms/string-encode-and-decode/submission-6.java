class Solution {

    public String encode(List<String> strs) {
        String output="";
        for(String s:strs){
            output+= s.length()+"*"+s;
        }
        return output;
    }

    public List<String> decode(String str) {
        List<String> output = new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int start = str.indexOf('*',i);
            int len = Integer.parseInt(str.substring(i,start));
            output.add(str.substring(start+1,start+1+len));
            i = start+1+len;
        }
        return output;
    }
}
