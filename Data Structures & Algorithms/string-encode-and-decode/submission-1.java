class Solution {

    public String encode(List<String> strs) {
        String res="";
        for(String ch:strs)
        {
            res=res+Integer.toString(ch.length())+"#"+ch;
        }
         return res;


    }

    public List<String> decode(String str) {
        List<String> decoded_strs=new ArrayList<>();
        int i=0;
        while(i<str.length())
        {
            //String res="";
            int hashIndex=str.indexOf('#',i);
            int length=Integer.parseInt(str.substring(i,hashIndex));
            decoded_strs.add(str.substring(hashIndex+1,length+hashIndex+1));
            i=1+hashIndex+length;

        }
        
       return decoded_strs; 

    }
}
