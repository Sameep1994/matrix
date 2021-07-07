public class SnakePatterns {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        print(arr);
    }
     public static void print(int[][] a){
        int C = a.length;
        int R = a[0].length;
        for(int i=0;i<R;i++){
            if(i%2==0){
                for(int j=0;j<C;j++)
                    System.out.print(a[i][j]+" ");
                System.out.println(" ");
            }
            else{
                for(int j=C-1;j>=0;j--)
                    System.out.print(a[i][j]+" ");
                System.out.println(" ");
            }
        }

     }
}
