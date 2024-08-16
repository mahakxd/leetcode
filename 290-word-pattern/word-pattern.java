class Solution { // n:pattern length T.C:0(n) S.C:0(n)
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        HashMap<Character,String> map=new HashMap<>();
        HashMap<String,Boolean> used=new HashMap<>();

        if(pattern.length()!=words.length) 
          return false;
        for(int i=0;i<pattern.length();i++)
        {
            
            char ch=pattern.charAt(i);
            if(map.containsKey(ch)==false)
              {
                  if(used.containsKey(words[i])==true)
                    return false;
                  else
                  {
                      used.put(words[i],true);
                      map.put(ch,words[i]);
                  }  
              }
              else
              {
                  String mwith=map.get(ch);
                  if(mwith.equals(words[i])==false)
                    return false;
              }
        }
        return true;
    }
}