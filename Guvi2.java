import java.util.*;
class Guvi2
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        if(n>0)
        {
          if(n%2==0)
           {
            System.out.print("even");
           }
          else
          {
           System.out.print("odd");
          }
        }
        else
        {
            System.out.print("Invalid");
        }
}
}
