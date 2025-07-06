import java.util.*;
public class second{
     public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
       int[] arr=new int[n];
       for(int i=0;i<n;i++)
          arr[i]=sc.nextInt();
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        int smax=Integer.MIN_VALUE;
        int smin=Integer.MAX_VALUE;
        //int smax=0,smin=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                smax=max;
                max=arr[i];
            }
            else if(arr[i]>smax && arr[i]!=max) smax=arr[i];
            if(arr[i]<min ){
                smin=min;
                min=arr[i];
            }
            else if(arr[i]<smin && arr[i]!=min) smin=arr[i];
        }
        System.out.println("max"+smax);
        System.out.println("min"+smin);
     }
}