class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        char[] jew=jewels.toCharArray();
        char[] sto=stones.toCharArray();
        int count=0;
        for(int i=0;i<sto.length;i++){
            for(int j=0;j<jew.length;j++){
                if(sto[i]==jew[j]){
                    count++;
                }
            }
        }
        return count;
    }
}