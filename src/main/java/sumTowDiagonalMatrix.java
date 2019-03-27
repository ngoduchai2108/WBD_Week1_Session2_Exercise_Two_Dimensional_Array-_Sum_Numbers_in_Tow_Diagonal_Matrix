import java.util.Scanner;

public class sumTowDiagonalMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size;
        do {
            System.out.println("Enter a size matrix:");
            size = scanner.nextInt();
            if (size > 15){
                System.out.println("Size should NOT exceed 15!!!");
            }
        }while (size >15);
        //Enter value for element
        int [][] matrix = new int[size][size];
        for (int i=0; i<size; i++){
            for (int j=0; j<size; j++){
                System.out.println("Element row "+ (i+1) + ", col "+ (j+1) + " is: ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        //Show Matrix
        System.out.println("Matrix is: ");
        for (int i=0; i<size; i++){
            System.out.println(" ");
            for (int j=0; j<size;j++){
                System.out.print(matrix[i][j] + "\t");
            }
        }
        System.out.println(" ");
        //Sum 2 diagonal
        int sum = 0;
        for(int i=0; i<size;i++){
            sum += matrix[i][i] + matrix[i][size-1-i];
        }
        if (size%2 == 1){
            sum = sum - matrix[(size-1)/2][(size-1)/2];
        }
        System.out.println("Sum Numbers in Tow Diagonal os Matrix is: "+sum);
    }
}
