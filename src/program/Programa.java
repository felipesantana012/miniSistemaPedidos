package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Pedido;
import entities.Produto;
import entities.enums.StatusPedido;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner t = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.println("Entre com dados do Cliente");
		System.out.print("Nome : ");
		String nome = t.nextLine();
		System.out.print("Email : ");
		String email = t.next();
		System.out.print("Data Nascimento (DD/MM/YYYY): ");
		Date dataNasc = sdf.parse(t.next());
		Cliente cliente = new Cliente(nome, email, dataNasc);
		
		System.out.println();
		
		System.out.println("Entre com os dados do Pedido");
		System.out.print("Status do pedido : ");
		StatusPedido status = StatusPedido.valueOf(t.next());
		
		Pedido pedido = new Pedido(new Date(), status, cliente);

		System.out.print("Quantos item o pedido vai ter : ");
		int qnt = t.nextInt();
		
		for(int i=0; i<qnt; i++) {
			System.out.println();
			System.out.println("Entre com o item #" + (i+1) +" : ");
			System.out.print("Nome Produto : ");
			t.nextLine();
			String produtoNome = t.nextLine();
			System.out.print("Preco Produto : ");
			double produtoPreco = t.nextDouble();
			System.out.print("Quantidade : ");
			int quantidade = t.nextInt();
			
			Produto produto = new Produto(produtoNome, produtoPreco);
			ItemPedido it = new ItemPedido(quantidade, produtoPreco, produto);
			pedido.addItem(it);
		}
		
		System.out.println();
		
		System.out.println(pedido);
			
	t.close();
		

	}

}
