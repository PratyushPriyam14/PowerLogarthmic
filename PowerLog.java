import java.io.*;
import java.util.*;

public class PowerLog {
    public static void main(String [] args)throws Exception{
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int n=s.nextInt();
        int p=powerlog(x,n);
        System.out.println(p);

    }
    public static int powerlog(int x, int n){
        if(n==0){
            return 1;
        }
          int xnb2=powerlog(x,n/2);
          int xn=xnb2*xnb2;   //it is for even case  n=18
          //if n is odd then when n=7
        if(n%2==1)
        {
            xn=xn*x;
        }
          return xn;
    }
}
