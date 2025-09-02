package chapter2;

public class Array2Dimensi {
     public static void main(String[] args) {
        int[][] m = {
            {1, 2, 3, 11},
            {4, 5, 6, 22},
            {7, 8, 9, 33}
        };
        for(int i=0;i < 3 ;i++){
           for(int j=0;j< 4;j++){
             System.out.print(m[i][j]+" ");
           }
           System.out.println(); 
         }
        System.out.println(); 
        
        int[][] newArray = transposeMatrix(m);
        for(int i=0;i < 4 ;i++){
           for(int j=0;j< 3;j++){
             System.out.print(newArray[i][j]+" ");
           }
           System.out.println(); 
         }
     }
     
     public static int[][] transposeMatrix(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        int[][] result = new int[cols][rows];
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        
        return result;
    }

}
