package _03_Intro_to_2D_Arrays;

public class _02_RowColumnSum {

    public int getSumByRow(int[][] matrix, int row) {
    	int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
			int a = matrix[row][i];
			sum += a;
		}
        System.out.println("Row:" + sum);
        
        
        return sum;
    }
    
    public int getSumByColumn(int[][] matrix, int col) {
       	int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
			int a = matrix[i][col];
			sum += a;

		}
        System.out.println("Column:" + sum);
        return sum;
    }
}
