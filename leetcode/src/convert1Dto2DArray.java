import java.util.Arrays;

public class convert1Dto2DArray {
    public static int[][] construct2DArray(int[] original, int m, int n) {
        int noOfEle = m*n;

        if(noOfEle != original.length ){
            return new int[0][0];
        }

        int[][] ans = new int[m][n];
        int k = 0;
        for (int i =0 ; i < m; i ++){
            for(int j = 0; j < n; j++){
                ans[i][j] = original[k];
                k++;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{5,6,7,8,9,10,11,12,45},3, 3)));
    }
}
