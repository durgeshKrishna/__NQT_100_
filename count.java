import java.util.*;
public class count{
    public static void main(String[] args){
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();
        // int[] arr=new int[n];
        // for(int i=0;i<n;i++)
        //   arr[i]=sc.nextInt();
        // boolean[] visited=new boolean[n];
        // for(int i=0;i<n;i++){
        //     if(visited[i]==true) continue;
        //     int count=1;
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]==arr[j]){
        //             visited[j]=true;
        //             count++;
        //         }    
        //     }
        //     System.out.println("Element " + arr[i] + " count " + count);                  
        // }

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
          map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        map.forEach((key,value)->{
            System.out.println(key +" =>" + value);
        });
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println("key"+ entry.getKey());
            System.out.println("value"+ entry.getValue());
        }


        }
}