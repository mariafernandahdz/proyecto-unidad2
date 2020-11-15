package com.example.demo.models;

public class Tickets
{
	private String idTicket;
	private String idVenta;
	private String nSerie;
	private String cantidad;
	private String precio;
	
	public String getIdTicket() {
		return idTicket;
	}
	public void setIdTicket(String idTicket) {
		this.idTicket = idTicket;
	}
	public String getIdVenta() {
		return idVenta;
	}
	public void setIdVenta(String idVenta) {
		this.idVenta = idVenta;
	}
	public String getnSerie() {
		return nSerie;
	}
	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}
	public String getCantidad() {
		return cantidad;
	}
	public void setCantidad(String cantidad) {
		this.cantidad = cantidad;
	}
	public String getPrecio() {
		return precio;
	}
	public void setPrecio(String precio) {
		this.precio = precio;
	}
	
	public Tickets(String idTicket, String idVenta, String nSerie, String cantidad, String precio) {
		super();
		this.idTicket = idTicket;
		this.idVenta = idVenta;
		this.nSerie = nSerie;
		this.cantidad = cantidad;
		this.precio = precio;
	}
	
	
}
