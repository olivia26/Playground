import java.util.Scanner;
class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int list[] = new int[n];
    for(int index = 0; index < n; index++)
    {
       
      list[index] = sc.nextInt();
    }
      //System.out.print("a1");
      int max=list[0];
      //System.out.print(max);
      int a=0;
  for(int index = 0; index <= (n-1); index++)
		  {
		  if(list[index]>max){
            max=list[index];
             a=index;
    //System.out.print(a);}
        } 
  }
             System.out.print(a);
		  
     
    }

}