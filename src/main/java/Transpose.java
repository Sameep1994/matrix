public class Transpose {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
//        printTranspose(arr);

        printTransEff(arr);
    }
//row become column and column become row
    //naive
    public static void printTranspose(int[][] a){
        int C = a.length;
        int R = a[0].length;
        int[][] temp= new int[R][C];
        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++)
                temp[i][j]=a[j][i];
        }

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                a[i][j]=temp[i][j];
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
    //efficient
    public static void printTransEff(int[][]a){
        int C = a.length;
        int R = a[0].length;
        for (int i=0;i<R;i++){
            for(int j=i+1;j<C;j++){
                swap(a,i,j);
            }
        }

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    static void swap(int mat[][], int i, int j)
    {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }

}
