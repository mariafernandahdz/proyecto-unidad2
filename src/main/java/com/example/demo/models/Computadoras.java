package com.example.demo.models;

public class Computadoras
{
	private String nSerie;
	private String marca;
	private String procesador;
	private String sOperativo;
	private String ram;
	private String nNucleos;
	
	public String getnSerie() {
		return nSerie;
	}
	public void setnSerie(String nSerie) {
		this.nSerie = nSerie;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getProcesador() {
		return procesador;
	}
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	public String getsOperativo() {
		return sOperativo;
	}
	public void setsOperativo(String sOperativo) {
		this.sOperativo = sOperativo;
	}
	public String getRam() {
		return ram;
	}
	public void setRam(String ram) {
		this.ram = ram;
	}
	public String getnNucleos() {
		return nNucleos;
	}
	public void setnNucleos(String nNucleos) {
		this.nNucleos = nNucleos;
	}
	
	public Computadoras(String nSerie, String marca, String procesador, String sOperativo, String ram,
			String nNucleos) {
		super();
		this.nSerie = nSerie;
		this.marca = marca;
		this.procesador = procesador;
		this.sOperativo = sOperativo;
		this.ram = ram;
		this.nNucleos = nNucleos;
	}
	
	
}
