package com.example.demo.models;

public class Proveedores
{
	private String idProveedor;
	private String nomCompania;
	private String nomContacto;
	private String email;
	private String rfc;
	private String telefono;
	private String direccion;
	
	public String getIdProveedor() {
		return idProveedor;
	}
	public void setIdProveedor(String idProveedor) {
		this.idProveedor = idProveedor;
	}
	public String getNomCompania() {
		return nomCompania;
	}
	public void setNomCompania(String nomCompania) {
		this.nomCompania = nomCompania;
	}
	public String getNomContacto() {
		return nomContacto;
	}
	public void setNomContacto(String nomContacto) {
		this.nomContacto = nomContacto;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getRfc() {
		return rfc;
	}
	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	public Proveedores(String idProveedor, String nomCompania, String nomContacto, String email, String rfc,
			String telefono, String direccion) {
		super();
		this.idProveedor = idProveedor;
		this.nomCompania = nomCompania;
		this.nomContacto = nomContacto;
		this.email = email;
		this.rfc = rfc;
		this.telefono = telefono;
		this.direccion = direccion;
	}
}
