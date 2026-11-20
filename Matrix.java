import java.util.Scanner;
 
public class Matrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[3][3];
        char choice;
        do {
            System.out.println("Input 9 elements:");
            for (int i = 0; i < 3; i++)           // read the matrix row by row
                for (int j = 0; j < 3; j++)
                    matrix[i][j] = input.nextInt();
            System.out.println("\nDisplay Here are the Numbers and the required outputs:");
            System.out.println("=============================================");
            System.out.println("\t\t\t\t\tRow Sum");
            int[] colSum = new int[3];             // one running total per column
            int diag1 = 0, diag2 = 0;
            for (int i = 0; i < 3; i++) {
                int rowSum = 0;                    // resets for every row
                for (int j = 0; j < 3; j++) {
                    System.out.print("\t" + matrix[i][j]);
                    rowSum += matrix[i][j];
                    colSum[j] += matrix[i][j];
                }
                diag1 += matrix[i][i];             // main diagonal
                diag2 += matrix[i][2 - i];         // anti-diagonal
                System.out.println("\t\t" + rowSum);
            }
            System.out.print("\nColumn sum: ");
            for (int j = 0; j < 3; j++)
                System.out.print("\t" + colSum[j]);
            System.out.println("\n=============================================");
            System.out.println("Diagonal sum 1: \t" + diag1);
            System.out.println("Diagonal Sum 2: \t" + diag2);
            System.out.print(" Try Again [y|n]: ");
            choice = input.next().charAt(0);
        } while (choice == 'y' || choice == 'Y');
        System.out.print(" Program Ended Thank You! ");
        input.close();
    }
}
 