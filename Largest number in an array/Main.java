import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
        Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int arr[]=new int[n];
      for(int i=0;i<=n-1;i++)
      {
        arr[i]=in.nextInt();
    }
      int max=arr[0];
      for(int i=0;i<=n-1;i++)
      {
        if(arr[i]>max){
max=arr[i];
        }
    }
      System.out.println(max);
    }
}