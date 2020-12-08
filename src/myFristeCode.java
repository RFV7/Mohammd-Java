import java.util.Scanner;

public class myFristeCode {
	
	public static void mm() {
		Scanner input = new Scanner(System.in);
		System.out.println(" ! áãæÙİíä ÚÏÏ  ÇÏÎá  ");
		int size;
		size = input.nextInt();
		
		double [] salaries = new double [size]; 	
		
		for (int i=0; i<salaries.length; i++ )
		{
			
			System.out.println((i+1)+(" ÑŞã ÇáãæÙİ ÑÇÊÈ ÇÏÎá" ));
		salaries[i] = input.nextDouble();
		
		if( salaries[i] >=11000 )
		System.out.print("ÇáãÍÇæáå  ÇÚÏ 11000   Úä  áÇíÒíÏ ÇáÑÇÊÈ ");
		
		else if(salaries[i] <=5000)
			System.out.println(" 5000ÇáÑÇÊÈ áÇ íŞá ");
		
		
		
		}	
			
	}
	public static void main(String[] args) {
		
	 mm();
	 System.out.println("ÇäÊåíäÇ áß ÔßÑÇ ");
	 System.out.print("ÇáãÍÇæáå  ÇÚÏ 8000 Úä  áÇíÒíÏ ÇáÑÇÊÈ ");
	
	}

}


		


