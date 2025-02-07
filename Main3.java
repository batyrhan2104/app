import java.util.Arrays;

public class Main3 {
    public static void sortEachRow(int[][] matrix) {
        for (int[] matrix1 : matrix) {
            Arrays.sort(matrix1);
        }
    }
    
    public static void printMatrix(int[][] matrix) {
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print(matrix1[j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int[][] matrix = {{5, 3, 8}, {9, 2, 7}, {4, 6, 1}};
        
        System.out.println("Бастапқы матрица:");
        printMatrix(matrix);
        
        // Әр жолды сұрыптаймыз
        sortEachRow(matrix);
        
        System.out.println("\nСұрыпталған матрица:");
        printMatrix(matrix);
    }
}