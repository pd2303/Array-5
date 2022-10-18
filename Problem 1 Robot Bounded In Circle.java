//O(N) time and space solution

class Solution {
    public boolean isRobotBounded(String instructions) {
                                  // N     E     S       W
        int[][] dirs = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        int x =0; int y=0;
        int idx = 0; //index on dirs array
        for(int j=0;j<4;j++){
            for(int i = 0;i<instructions.length();i++){
                char c = instructions.charAt(i);
                if(c == 'G'){
                    x = x + dirs[idx][0];
                    y = y + dirs[idx][1];
                }else if (c == 'R'){
                    idx = (idx + 1)%4;
                }else{
                      idx = (idx + 3)%4;
                }
            }
        }
        return x==0 && y==0;
    }
}
