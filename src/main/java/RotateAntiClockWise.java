public class RotateAntiClockWise {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        rotate(arr);
    }

    /*1.find transpose
    * 2.reverse individual columns eg last rwo becomes first, second last becomes second and so on*/
public static void rotate(int[][] a){
    int C = a.length;
    int R = a[0].length;
    for (int i=0;i<R;i++){
        for(int j=i+1;j<C;j++){
            swap(a,i,j);
        }
    }

    for(int i=0;i<R;i++){
        int low=0,high=R-1;
        while (low<high){
            swap2(low,high,i,a);
            low++;
            high--;
        }
    }

    for(int i=0;i<R;i++){
        for(int j=0;j<C;j++){
            System.out.print(a[i][j]+" ");
        }
        System.out.println(" ");
    }


}

    static void swap2(int low, int high, int i, int mat[][])
    {
        int temp = mat[low][i];
        mat[low][i] = mat[high][i];
        mat[high][i] = temp;
    }
    static void swap(int mat[][], int i, int j)
    {
        int temp = mat[i][j];
        mat[i][j] = mat[j][i];
        mat[j][i] = temp;
    }
}
