package prog;

public class fibo_using_recursion
{
	static void disp(int fib1,int fib2)
	{
		System.out.println("fib1 fib2 fib3");
		for(int i=0;i<=10;i++)
		{
		int fib3;
		fib3=fib1+fib2;
		fib1=fib2;
		fib2=fib3;
		System.out.println(fib3+" ");
	}
	}
	public static void main(String[] args) 
	{
		disp(0,1);
	}
}

