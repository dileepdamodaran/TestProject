/**
 * 
 * @author dileepdamodaran
 *
 */
public class MatrixMultiplication {

	public static void main(String args[]) {
		int matrix1[][]= {
				{2,4,5},
				{3,6,8}
		};
		int matrix2[][]= {
				{2,8},
				{3,6},
				{6,5}
		};
		int matrxLength = matrix1.length;
		for(int i=0; i<matrxLength;i++) {
			for (int k=0 ; k<matrix1[i].length; k++) {
				System.out.println(matrix1[i][k]);
			}
		}
	}
}
