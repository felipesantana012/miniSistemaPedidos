package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	private Date moment;
	private StatusPedido status;
	private List<ItemPedido> itemPedidos = new ArrayList<>();
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

	public List<ItemPedido> getItemPedido() {
		return itemPedidos;
	}
	
	public void addItemPedido(ItemPedido itemPedido) {
		itemPedidos.add(itemPedido);
		
	}
	
	public void removeItemPedido(ItemPedido itemPedido) {
		itemPedidos.remove(itemPedido);
		
	}
	
	public Double total() {
		return null;
		
	}
	
	
	
	

}
