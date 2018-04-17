package com.ciam.financia.model;

public class Socio {

	private int id;
	private String nombre;
	private double tasa;
	private int montoMaximo;
//	public int cotizacion;
//	public int mensual;
	
	public Socio(int id, String nombre, double tasa, int montoMaximo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.tasa = tasa;
		this.montoMaximo = montoMaximo;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getTasa() {
		return tasa;
	}
	public void setTasa(double tasa) {
		this.tasa = tasa;
	}
	public int getMontoMaximo() {
		return montoMaximo;
	}
	public void setMontoMaximo(int montoMaximo) {
		this.montoMaximo = montoMaximo;
	}
	
	
//	public void cotizacion(int montoPedido) {
//		int cotiz=(int) (montoPedido*(1+((this.tasa)/100)*36));
//		this.cotizacion=cotiz;
//		this.mensual=cotiz/36;
//	}
	
	
	
	
}
