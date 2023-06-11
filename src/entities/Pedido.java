package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private StatusPedido status;
	private List<ItemPedido> items = new ArrayList<ItemPedido>();
	private Cliente cliente;
	
	public Pedido() {
		
	}

	public Pedido(Date moment, StatusPedido status, Cliente cliente) {
		this.moment = moment;
		this.status = status;
		this.cliente = cliente;
	}


	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(ItemPedido item) {
		items.add(item);
		
	}
	
	public void removeItem(ItemPedido item) {
		items.remove(item);
		
	}
	
	public Double total() {
	
		double sum =0;
		for(ItemPedido it : items) {
			sum+= it.subTotal();
		}
		
		return sum;
		
	}
	
	
	@Override
	public String toString() {
		
		StringBuilder sb = new StringBuilder();
		sb.append("Momento do pedido : ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Status Pedido : ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente+"\n");
		sb.append("Itens Pedido : \n");
		for(ItemPedido item : items) {
			sb.append(item + "\n");
		}
		sb.append("Total preco : $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
		
		
	}
	

}
