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
      int a=0,count=0,p=2;
      while(p>0){      
      int m=in.nextInt();
      for(int i=0;i<=n-1;i++)
      {
       if(m==arr[i])
       {
        a=i;
         count=1;
       //  System.out.println("ji");
         break;
       }  
        else{
          count=0;
    }
      }
      
       if(count==1)
        System.out.println(a);
        if(count==0)
          System.out.println("-1");
          
       p--;
      }
   
}}