import java.util.*;
import java.util.stream.IntStream;
public class Sum_Arr{
  public static void main(String args[]) {
    int n = 5;
    int arr[] = {1,2,3,4,5};
    int sum = 0;
    for (int i = 0; i < n; i++) {
      sum += arr[i];
      //IntStream.of(arr).sum();
    }
    System.out.println("The sum of the elements of the array is "+sum);
  }
}
