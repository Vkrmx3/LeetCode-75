public class Day107_867_TransposeMatrix{
  public static void main (String []args){
    int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};
    System.out.println(Arrays.deeptoString(transpose(matrix))); 
  }
    public int[][] transpose(int[][] matrix) {
        int [][]res = new int [matrix[0].length][matrix.length];
        for(int i = 0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
               res[j][i] = matrix[i][j];
            }
        }
        return res;
    }
}
