import java.util.Scanner;

public class MARCHESI
{
	static Scanner in = new Scanner(System.in);
	
	public static void main(String[] args)
	{
		while(true)
		{
			stampaMenu();
			int scelta = Integer.parseInt(in.nextLine());
			switch(scelta)
			{
				case 1:
					es1();
				break;
				case 2:
				
					
				break;
				case 3:
					
				break;
				default:
					System.out.println("Scelta errata, riprova!");

			}
		}
	}
	static void stampaMenu()
	{
		
		System.out.println("1 - Es n. 1 - Il terzo array riordina i numeri dei primi due");
		System.out.println("2 - Es n. * - Titolo es. *");
	}
	
	static void es1()
	{
	int[]v= new int[5];
	int[]v1= new int[5];
	int[] v2= new int[v.length+v1.length];
	for(int i=0;i<v.length;i++)
		{
		System.out.println("Inserisci numero");
		v[i]=Integer.parseInt(in.nextLine());
		}
	
	for(int j=0;j<v1.length;j++)
		{
		System.out.println("Inserisci numero");
		v[j]=Integer.parseInt(in.nextLine());
		}
	for(int i=0;i<v.length;i++)
	{
		v2[i]=v[i];
	}
	for(int j=0;j<v1.length;j++)
	{
		v2[j+v.length]=v[j];
	}
	for(int i=0;i<v2.length;i++)
	{
		for(int j=0;j<v2.length;j++)
		
			if(v2[i]>v2[i+1])
		{
		swap(v2,i+1,i);
		}
		for(int z=0;z<v2.length;z++)
		{
			System.out.println(v2[z]);
		}
	}
		
	
	 
	}
	static void swap(int[]array, int i, int j)
	{
		int temp=array[j];
		array[j]=array[i];
		array[i]= temp;
	}
}
