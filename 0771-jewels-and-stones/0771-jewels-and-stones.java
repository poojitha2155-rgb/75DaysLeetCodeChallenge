class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int ans=0;
    for(int i=0;i<stones.length();i++){
        char ch1=stones.charAt(i);
        boolean found=false;
    for(int j=0;j<jewels.length();j++){
      char ch2=jewels.charAt(j);
      if(ch1==ch2){
       found=true;
       break;
      }
    }
      if (found==true){
        ans=ans+1;
    }  
    }
    return ans;
}
}