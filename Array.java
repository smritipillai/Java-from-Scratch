public class Array{
  public static void main(String[] args) {
    int[] arr ={1,3,8,7,5};
    for(int i =0; i<arr.length; i++){
      System.out.print(arr[i]+ " ");
    }
    System.out.println();
    int sum = 0;
    for(int i =0; i<arr.length; i++){
      sum = sum + arr[i];
  }
  System.out.println("The total sum is: "+ sum);
  int max = arr[0];
  for(int i=0; i< arr.length; i++){
    if(arr[i]>arr[0]){
      max = arr[i];
    }
  }
  System.out.println("Th max element in the array is: "+ max);
}
}
