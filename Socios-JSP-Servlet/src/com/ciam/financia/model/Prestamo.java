package com.ciam.financia.model;

public class Prestamo {
	
	private Socio socio;
	private int monto;
	private double tasa;
	private double pagoTotal;
	private double pagoMensual;
	
	
	public Prestamo(Socio socio, int monto, double tasa) {
		super();
		this.socio = socio;
		this.monto = monto;
		this.tasa = tasa;
		double pagotemp=monto*(1+((this.tasa)/100)*36);
		this.pagoTotal = (double) Math.round(pagotemp * 100d) / 100d;
		double pagoM=pagotemp/36;
		this.pagoMensual = (double) Math.round(pagoM * 100d) / 100d;
		
		
	}

	

	public Socio getSocio() {
		return socio;
	}

	public void setSocio(Socio socio) {
		this.socio = socio;
	}

	public int getMonto() {
		return monto;
	}

	public void setMonto(int monto) {
		this.monto = monto;
	}

	public double getTasa() {
		return tasa;
	}

	public void setTasa(double tasa) {
		this.tasa = tasa;
	}

	public double getPagoTotal() {
		return pagoTotal;
	}

	public void setPagoTotal(double pagoTotal) {
		this.pagoTotal = pagoTotal;
	}

	public double getPagoMensual() {
		return pagoMensual;
	}

	public void setPagoMensual(double pagoMensual) {
		this.pagoMensual = pagoMensual;
	}
	
	
	

}
