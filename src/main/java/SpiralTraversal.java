public class SpiralTraversal {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        spiral(arr);
    }
    /*4 pt approach top(1) right(4) bottom(16) left(13) as per our input
    *
    *
    *  and move them inwards after each traversal*/
    public static void spiral(int[][] a){
        int C = a.length;
        int R = a[0].length;
        int top=0,left=0,bottom=R-1,right=C-1;
        while(top<=bottom && left<=right){
            //top row
            for(int i=left;i<=right;i++)
                System.out.println(a[top][i]+" ");
            top++;
            //right column
            for(int i=top;i<=bottom;i++)
                System.out.println(a[i][right]+" ");
            right--;
            //bottom row reverse order
            if(top<=bottom){
                for(int i=right;i>=left;i--)
                    System.out.println(a[bottom][i]+" ");
                bottom--;
            }
            //left column, revrse order
            if(left<=right){
                for(int i=bottom;i>=top;i--)
                    System.out.println(a[i][left]+" ");
                left++;
            }
        }

    }
}
