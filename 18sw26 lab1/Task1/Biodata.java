/* Task no 1: Write a program in which declear some variables with vaild identifiers, 
to hold your name ;your total marks in pervious semester, percentage ,your grade,
your status pass or fail (by a boolen variable etc,assign them explicitly and print them 
.Try to declear Variables of all 8 data types and assign the appropiate values. */
class Biodata{
	public static void main(String[] args)
	{
		String name="Muhammad Ibraheem";
		int marks1st=446;
		long marks2nd=400;
		int total1st=550;
		int totalmarks=1100; 
		float percentage1st=((marks1st*100)/550);
		float percentage2nd=((marks2nd*100)/550);
		char grade='A';
		double avgpercentage=(percentage1st+percentage2nd)/2;
		boolean pass=true;
		
		byte sem=1;
		
	System.out.print("Name of student : "+name					);
	System.out.println("Semester "+sem							);
	System.out.println("Marks Obtain in 1st Year "+marks1st		);
	System.out.println("Total Marks in 1st Year "+total1st		);
	System.out.println("Percentage in 1st year "+ percentage1st	);
	System.out.println("Marks Obtain in 2nd Year "+marks2nd		);
	System.out.println("Total Marks in 2nd Year "+total1st		);
	System.out.println("Percentage in 2nd Year "+ percentage2nd	);
	System.out.println("Total Marks in 1st and 2nd Year "+totalmarks);
	System.out.println("Final Percentage "+avgpercentage		);
	System.out.println("Grade "+grade							);
	if(avgpercentage>50)
	{
		if(pass==true)
		{
			System.out.println("Final Status : Pass"			);
		}
	}

	
	
}
}