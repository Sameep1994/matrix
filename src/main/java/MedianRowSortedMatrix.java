import java.util.Arrays;

public class MedianRowSortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {{1, 10, 20},
                {15, 25, 35},
                {5, 30, 40}};
        System.out.println(median(arr));
    }

/*we are computing the min and max element of matrix
then we compute the median postion,ie how many elements are greater and smaller from an element
then compute binary search and see if the position obtained from search is lessthan or greater than the median position and move
min and max accordingly
* */
/*Constraint: Odd size matrix , All distinct elements
*
* O(R*log(max-min)*logC) is time complexity*/
    public static int median(int[][] a){
        int C = a.length;
        int R = a[0].length;
        int min=a[0][0],max=a[0][C-1];
        for(int i=1;i<R;i++){
            if(a[i][0]<min){
                min=a[i][0];
            }
            if(a[i][C-1]>max){
                max=a[i][C-1];
            }
        }

        int medPos=(R*C+1)/2;
        while(min<max){
            int mid=(min+max)/2,midPos=0;
            for(int i=0;i<R;i++){
                int pos= Arrays.binarySearch(a[i],mid)+1;
                //after we find mid element then we find its position,
                //arrays binary search gives pos of element if exisits or the position where it should have been inserted
                //todo this logic
                midPos+=Math.abs(pos);
            }
            if(midPos<medPos)
                min=mid+1;
            else
                max=mid;
        }

        return min;
    }

}
