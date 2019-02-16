import java.util.Scanner;
class Main{
  public static int great(int a,int b){
    if(a>b)
      return a;
        else
          return b;
        
  }
	public static void main (String[] args){
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int a=in.nextInt();
      int b=in.nextInt();
      int c=in.nextInt();
      int d=great(a,b);
      if(c>d)
        System.out.println(c);
        else
          System.out.println(d);
        
      }
}