import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner n=new Scanner(System.in);
      int a=n.nextInt();
      	 int b=n.nextInt();
       int c=n.nextInt();
      int temp;
      if(a>b){
        if(a>c)
          temp=a;
          
        else
          temp=b;
      }
        else
          temp=c;
      System.out.println(temp);
}
}