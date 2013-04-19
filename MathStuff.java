import sun.net.idn.StringPrep;

/**
 * Created with IntelliJ IDEA.
 * User: theraccoun and the herzlnator
 * Date: 4/18/13
 * Time: 9:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class MathStuff {

    public static int square(int x)
    {
        return x*x;
    }

    public static void main(String[] args)
    {
        System.out.println(square(2));
    }

    public static boolean isPrime(int n)
    {
        if(n%2==0){return false;}

        for(int d=3;d*d<=n;++d)
        {
            if(n%d==0){return false;}
        }
        return true;
    }

}
