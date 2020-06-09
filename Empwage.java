public class Empwage
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Employee Wage Computation Process");
		//constants
		int IS_FULL_TIME=1;
		int WAGE_PER_HOUR=20;
		int HOUR_PER_DAY=8;
		//computation
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if ( empcheck == IS_FULL_TIME)
		{
			System.out.println("Employee is Present");
			int dailywage = (WAGE_PER_HOUR * HOUR_PER_DAY);
			System.out.println("Daily wage would be = Rs." + dailywage);
		}
		else
			System.out.println("Employee is Absent");
	}

}



