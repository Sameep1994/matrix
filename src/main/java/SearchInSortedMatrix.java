public class SearchInSortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        int x=10;
        search(arr,x);
    }

    //columns and rows are sorted
    /*Begin from top right corner
    *
    * if x is same, print pos and return
    *
    * if x is smaller move left
    *
    * if x is greater move down*/

    public static void search(int[][] a,int x){
        int C = a.length;
        int R = a[0].length;
        int i=0,j=C-1;
        while(i<R && j>=0){
            if(a[i][j]==x){
                System.out.println("Found at "+i+","+j);
                return;
            }else if(a[i][j]>x){
                j--;
            }else{
                i++;
            }
        }

        System.out.println("Not found");
    }

}
