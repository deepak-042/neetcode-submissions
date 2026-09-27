class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodestr = new StringBuilder();
        for( String str : strs){
            encodestr.append(str.length()).append('#').append(str);
        }
        return encodestr.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int i = 0;
        while(i < str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int l = Integer.parseInt(str.substring(i,j));
            i = j+1;
            ans.add(str.substring(i,l+i));
            i += l;
        }
        return ans;
    }
}
