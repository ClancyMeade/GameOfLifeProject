import java.util.ArrayList;

public class CareerList
	{
		static ArrayList<Career> jobs = new ArrayList<Career>();

		public static void showList()
			{
				jobs.add(new Career("Doctor", 120000, 0, true));
				jobs.add(new Career("Computer Consultant", 80000, 0, true));
				jobs.add(new Career("Artist", 50000, 0, false));
				jobs.add(new Career("Salesperson", 70000, 0, false));
				jobs.add(new Career("Athlete", 100000, 0, false));
				jobs.add(new Career("Accountant", 90000, 0, false));
				jobs.add(new Career("Teacher", 60000, 0, true));
				jobs.add(new Career("Entertainer", 80000, 0, false));
				jobs.add(new Career("Police Officer", 70000, 0, false));

				
			}
	}
