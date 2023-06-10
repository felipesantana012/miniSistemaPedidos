package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entities.enums.StatusPedido;

public class Pedido {
	
	private Date moment;
	private StatusPedido status;
	private List<ItemPedido> itemPedidos = new ArrayList<>();
	
	public Pedido() {
		
	}

	public Pedido(Date moment, StatusPedido status) {
		this.moment = moment;
		this.status = status;
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
