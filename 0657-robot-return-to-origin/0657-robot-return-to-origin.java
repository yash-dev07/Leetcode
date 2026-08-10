class Solution {
    public boolean judgeCircle(String moves) {
        char[] arr = moves.toCharArray();
        int c1 = 0;
        int c2 = 0;
        int c3 = 0;
        int c4 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'U') {
                c1++;
            }
            if (arr[i] == 'D') {
                c2++;
            }
            if (arr[i] == 'L') {
                c3++;
            }
            if (arr[i] == 'R') {
                c4++;
            }

        }
        if(c1==c2 && c3==c4 ){
            return true;
        }
        if (c1 == c2 && c1 == c3 && c1 == c4){
            return true;
        }
        return false;
    }
}