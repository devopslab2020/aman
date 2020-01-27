import java.util.*;
public class fibo {
    public static void main(String[] args) {
        int n = 10, t1 = 0, t2 = 1, t3=6,temp;
        System.out.print("First " + n + " terms: ");
        for (int i = 1; i <= n; ++i)
        {
            System.out.print(t1 + " + ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
	    temp=n+t3;
        }
    }
}