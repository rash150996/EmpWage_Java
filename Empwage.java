public class Empwage
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Employee Wage Computation Process");
		//constants
		int IS_FULL_TIME=1;
		//computation
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if ( empcheck == IS_FULL_TIME)
			System.out.println("Employee is Present");
		else
			System.out.println("Employee is Absent");
	}

}


