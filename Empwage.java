public class Empwage
{
		//constants
	int IS_PRESENT=1;
   int WAGE_PER_HOUR = 20;
   int HOUR_PER_DAY_FULL = 8;
   int HOUR_PER_DAY_PART = 4;
   int DAYS_PER_MONTH = 20;
   int HOURS_PER_MONTH = 100;

      //variables
   int totalEmpHrs = 0;
   int totalWorkingDays = 0;
   int empHrs = 0;
   int dailyWage = 0;
   int totalSalary = 0;
	double jobType = 0;
	double empcheck = 0;
	int[] Days;
	int[] DailyWage;
	int[] TotalSalary;

	public static void main(String[] args)
	{
		Empwage obj = new Empwage();
		obj.EmpCalc();
	}

	public int EmpCalc()
	{
		System.out.println("Welcome To Employee Wage Computation Process");
		empcheck = Math.floor(Math.random() * 10) % 2;
		if ( empcheck == IS_PRESENT )
		{
			System.out.println("Employee is Present");
			jobType = Math.floor(Math.random() * 10) % 2;
			switch((int)jobType)
			{
				case 1:
					 empHrs=8;
					break;
				case 0:
					 empHrs=4;
					break;
				default:
					 empHrs=0;
					break;
			}

		}
		else
			System.out.println("Employee is Absent");

		while ( totalWorkingDays <= DAYS_PER_MONTH && totalEmpHrs <= HOURS_PER_MONTH )
		{
			totalWorkingDays+=1;
			if ( (totalEmpHrs + empHrs) < HOURS_PER_MONTH )
			{
				totalEmpHrs+=empHrs;
			}
			else
				break;
			dailyWage = (empHrs * WAGE_PER_HOUR);
		}
	System.out.println("Total Working Hours = " + totalEmpHrs );
	totalSalary = (totalEmpHrs * WAGE_PER_HOUR);
	System.out.println("Total salary = " + totalSalary);
	return totalSalary;
 }

}


