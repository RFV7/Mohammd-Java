import java.util.Scanner;

public class myFristeCode {
	
	public static void mm() {
		Scanner input = new Scanner(System.in);
		System.out.println(" ! ������� ���  ����  ");
		int size;
		size = input.nextInt();
		
		double [] salaries = new double [size]; 	
		
		for (int i=0; i<salaries.length; i++ )
		{
			
			System.out.println((i+1)+(" ��� ������ ���� ����" ));
		salaries[i] = input.nextDouble();
		
		if( salaries[i] >=11000 )
		System.out.print("��������  ��� 11000   ��  ������ ������ ");
		
		else if(salaries[i] <=5000)
			System.out.println(" 5000������ �� ��� ");
		
		
		
		}	
			
	}
	public static void main(String[] args) {
		
	 mm();
	 System.out.println("������� �� ���� ");
	 System.out.print("��������  ��� 8000 ��  ������ ������ ");
	
	}

}


		


