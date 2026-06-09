public class matrix_2{
public static void printSpiral(int matrix[][]){
    int startRow = 0;
    int Startcol =0;
    int endRow = matrix.length;
    int endCol = matrix[0].length;
    while(startRow <= endRow && startCol <= endCol){
        //top
        for(int j=0;j<matrix.length;j++){
            System.out.print(matrix[startRow][j]+ " ");
        }
        //right
        for(int i =startRow +1;i<= endRow;i++){

        }
    }

}
}