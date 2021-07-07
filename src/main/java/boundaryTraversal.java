public class boundaryTraversal {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        printBoundary(arr);
    }

    public static void printBoundary(int[][] a){
        int C = a.length;
        int R = a[0].length;
        //corner cases when there is a single row or column only exist is handled separtely
        if(R==1){
            for(int i=0;i<C;i++)
                System.out.print(a[0][i]+" ");
            System.out.println(" ");
        }else if(C==1){
            for(int i=0;i<R;i++)
                System.out.print(a[i][0]+" ");
            System.out.println(" ");
        }else {
            //four loops are run for four edges
            for(int i=0;i<C;i++)
                System.out.print(a[0][i]+" ");
            System.out.println(" ");
            for (int i=1;i<R;i++)
                System.out.print(a[i][C-1]+" ");
            System.out.println(" ");
            for(int i=C-2;i>=0;i--)
                System.out.print(a[R-1][i]+" ");
            System.out.println(" ");
            for(int i=R-2;i>=1;i--)
                System.out.print(a[i][0]+" ");
            System.out.println(" ");
        }
    }
}
