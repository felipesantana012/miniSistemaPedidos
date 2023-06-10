package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner t = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Entre com dados do Cliente");
		System.out.print("Nome : ");
		String nome = t.nextLine();
		System.out.print("Email : ");
		String email = t.nextLine();
		System.out.print("Data Nascimento (DD/MM/YYYY): ");
		Date dataNasc = sdf.parse(t.next());
		System.out.print("Status do pedido : ");
		String Status = t.nextLine();
		
		System.out.print("Quantos item para este pedido : ");
		int qnt = t.nextInt();
		
		for(int i=1; i<qnt; i++) {
			System.out.print("Nome Produto " + i +" : ");
			
		}
				
				
				
				
				t.close();
		

	}

}
