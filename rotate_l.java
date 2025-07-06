import java.util.*;
public class rotate_l{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();
        System.out.println(Arrays.toString(arr));
        int k=sc.nextInt();
         k=k%n;
        // rev(arr,0,k-1); rev(arr,k,n-1); rev(arr,0,n-1);//left rotate
        // rev(arr,0,n-1); rev(arr,0,k-1); rev(arr,k,n-1); // right rotate
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int arr[],int left,int right){
       
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}