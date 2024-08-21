import java.util.Scanner;

public class Matrix {

     int row = scannMatrixRowAndCol();
     int col = scannMatrixRowAndCol();
     int chislo = scannMatrixRowAndCol();

    int doubleMatrix [][] = scannMatrix();
    int doubleMatrixDva[][] = scannMatrix();
    int sumMatrix[][] = sumMatrix();

    int scannMatrixRowAndCol() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number:");
        int par = scanner.nextInt();
        return par;
    }

     int[][] scannMatrix() {
        int testMatrix[][] = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                 testMatrix[i][j] = (int) (Math.random() * (100+1)) - 50;
            }
        }
        return testMatrix;
    }

    //3
    void printMatrix() {
       for (int i = 0; i < row; i++) {
           System.out.println();
           for (int j = 0; j < col; j++) {
               System.out.print(doubleMatrix[i][j] + " ");
           }
       }
       System.out.println();

        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print(doubleMatrixDva[i][j] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < row; i++) {
            System.out.println();
            for (int j = 0; j < col; j++) {
                System.out.print(sumMatrix[i][j] + " ");
            }
        }
        System.out.println();
   }

   //1
   int[][] sumMatrix() {
        int[][] sumMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumMatrix[i][j] = doubleMatrix[i][j] + doubleMatrixDva[i][j];
            }
        }
        return sumMatrix;
   }

   int[][] chisloMultiMatrix() {
        int[][] testMatrix = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                testMatrix[i][j] *= chislo;
            }
        }
        return testMatrix;
   }

}
