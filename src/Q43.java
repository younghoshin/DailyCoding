import java.util.*;
public class Q43 {
    public String spiralTraversal(Character[][] matrix) {
        // TODO:

//        HashMap<String,Integer[]> position = new HashMap<>();
//        position.put("RIGHT",new Integer[]{0,1});
//        position.put("LEFT",new Integer[]{0,-1});
//        position.put("DOWN",new Integer[]{1,0});
//        position.put("UP",new Integer[]{-1,0});

        int[][] serchArr = new int[matrix.length][matrix[0].length];
        int m =serchArr.length;
        int n = serchArr[0].length;
        int i = 0,j=-1;
        int range =0;
        String concat  ="";
        String postionState= "RIGHT";
        while(range<m*n){
            if (j+1<n&&serchArr[i][j+1]==0&&postionState.equals("RIGHT")){
                serchArr[i][j+1]=1;
                concat = concat+matrix[i][j+1];
                j++;
                if (j==n-1 || serchArr[i][j+1]==1){
                    postionState = "DOWN";
                }
            }
            else if (i+1<m&&serchArr[i+1][j]==0&&postionState.equals("DOWN")){
                serchArr[i+1][j]=1;
                concat = concat+matrix[i+1][j];
                i++;
                if (i==m-1 || serchArr[i+1][j]==1){
                    postionState = "LEFT";
                }
            }
            else if(j-1>=0&&serchArr[i][j-1]==0&&postionState.equals("LEFT")){
                serchArr[i][j-1]=1;
                concat = concat+matrix[i][j-1];
                j--;
                if (j==0 || serchArr[i][j-1]==1){
                    postionState = "UP";
                }
            }
            else if(i-1>=0&&serchArr[i-1][j]==0&&postionState.equals("UP")){
                serchArr[i-1][j]=1;
                concat = concat+matrix[i-1][j];
                i--;
                if (i==0|| serchArr[i-1][j]==1){
                    postionState = "RIGHT";
                }
            }
            range++;
        }

        return concat;
    }
}
