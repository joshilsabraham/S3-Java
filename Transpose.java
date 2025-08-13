import java.util.Scanner;

public class Transpose {
    public static void main(String[] args) {
        int[][] matrix = new int[4][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Array Elements (4x3 matrix): ");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // Transpose the matrix: original is 4x3, transpose is 3x4
        int[][] transpose = new int[3][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        System.out.println("Transpose of the Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }

        }
}
