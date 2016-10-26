package fcu.iecs.oop.tiida;

import java.util.Scanner;
public class NissanTiida {

	public int a,b;
	private Scanner nissanTiida;
	public void tiida()
	{
		int a,b;
		nissanTiida = new Scanner(System.in);
		System.out.print("Please Enter A Number:");
		int console = nissanTiida.nextInt();
		for(a=1;a<=console;a++)
		{
		    for(b=1;b<=a;b++)
		{
			System.out.printf("*");
		}
	    System.out.println();
	}


}
}