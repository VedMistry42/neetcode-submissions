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
        String curr = "";
        boolean gettingLength = true;
        int len=0;
        String length = "";
        for(int i=0; i<str.length();i++){
            char c = str.charAt(i);
            if(gettingLength){
                if(c=='*'){
                    gettingLength=false;
                    len = Integer.parseInt(length);
                    length = "0";
                    if(len==0){
                        output.add(curr);
                        gettingLength=true;
                    }
                }
                else{
                    length+=c;
                }
            }
            else{
                if(len==1){
                    gettingLength=true;
                    curr+=c;
                    output.add(curr);
                    curr="";
                }
                else{
                    curr+=c;
                    len--;
                }
            }
        }
        return output;
    }
}
