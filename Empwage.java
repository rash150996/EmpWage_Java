public class Empwage
{
	public static void main(String[] args)
	{
		System.out.println("Welcome To Employee Wage Computation Process");
		//constants
		int IS_PRESENT=1;
		int WAGE_PER_HOUR=20;
		int HOUR_PER_DAY_FULL=8;
		int HOUR_PER_DAY_PART=4;
		//computation
		double empcheck = Math.floor(Math.random() * 10) % 2;
		if ( empcheck == IS_PRESENT )
		{
			System.out.println("Employee is Present");
			double job_type = Math.floor(Math.random() * 10) % 2;
			switch((int)job_type)
			{
				case 1:
					System.out.println("Employee works Full Time");
					int dailywage = (WAGE_PER_HOUR * HOUR_PER_DAY_FULL);
					System.out.println("Daily wage would be = Rs." + dailywage);
					break;
				case 0:
            	System.out.println("Employee works Part Time");
            	int dailywagep = (WAGE_PER_HOUR * HOUR_PER_DAY_PART);
            	System.out.println("Daily wage would be = Rs." + dailywagep);
					break;
				default:
					System.out.println("Invalid");
			}

		}
		else
			System.out.println("Employee is Absent");
	}

}



