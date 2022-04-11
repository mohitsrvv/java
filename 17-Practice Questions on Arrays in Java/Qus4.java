public class Qus4 {
    public static void main(String[] args){
        int[][] mat1 = {{1,1,1},
                    {1,1,1}};
        int[][] mat2 = {{1,1,1},
                    {1,1,1}};
        int[][] result = {{0,0,0},
                    {0,0,0}};            
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.format("setting the value of i=%d and j=%d\n", i,j);
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
        }
        for(int i=0;i<mat1.length;i++){
            for(int j=0;j<mat1[i].length;j++){
                System.out.print(result[i][j] + " ");
                result[i][j] = mat1[i][j] + mat2[i][j];
            }
            System.out.println();
        }
    }
}
