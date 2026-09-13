class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,Integer> map=new HashMap<>();
        List<List<String>> mainLst=new ArrayList<>();
        for(int i=0;i<strs.length;i++)
        {
            char arr[]=strs[i].toCharArray();
            Arrays.sort(arr);
            String sorted=new String(arr);
            List<String> subList=new ArrayList<>();
            if(!map.containsKey(sorted))
            { map.put(sorted,i);
                subList.add(strs[i]);
                mainLst.add(subList);
            }
            
             else
            {
               for(int j=0;j<mainLst.size();j++)
               {
                 if(mainLst.get(j).contains(strs[map.get(sorted)]))
                 {
                    mainLst.get(j).add(strs[i]);
                 }
               }
            }

        }
        
       return mainLst; 
    }
}

