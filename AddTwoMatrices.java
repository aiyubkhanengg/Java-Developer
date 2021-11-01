// Java Program to Add Two Matrices
//This program coded by AIYUB KHAN GIT (aiyubkhanengg/Java-Developer)
//@uthor AIYUB KHAN
public class AddTwoMatrices {

    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] firstMatrix = { {3, 6, 9}, {6, 9, 12} };
        int[][] secondMatrix = { {2, 4, 6}, {8, 10, 13} };

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + "    ");
            }
            System.out.println();
        }
    }
}