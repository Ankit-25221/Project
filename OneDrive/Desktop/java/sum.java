 public class sum{
 public static int fact(int a){
    if(a<0)
    System.out.println("Wrong input");
    if(a==0)
     return 1;
     else 
     return a*fact(a-1);
}

    public static void main(String args[]){
        int a= 10;
        int b = 3;
        int temp;
        temp = a;
        a=b;
        b=temp;
        System.out.println(a+b);
        System.out.println(a*b);
        System.out.println(b%a);
        int t=fact(5);
        System.out.println("Factorial of 5 is "+ t);

      // for inverted right angle triangle 
       for(int i = 5; i>=1;i--){
        for(int j =i  ; j>=1;j--)
        System.out.print(" * ");
        System.out.println();
       }

   

}}