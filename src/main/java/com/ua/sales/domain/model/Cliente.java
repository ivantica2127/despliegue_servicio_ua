package com.ua.sales.domain.model;

import com.ua.sales.domain.exceptions.DNIInvalidException;
import com.ua.sales.domain.exceptions.EMailInvalidException;

public class Cliente {

	private Integer id;
	private String nombre;
	private String apellido;
	private String dni;
	private String correo;
	
	private Cliente() {}
	
	public static class Builder{
		private Cliente cliente;
		
		public Builder() {
			this.cliente = new Cliente();
		}
		
		public Builder id(Integer id) {
			this.cliente.id=id;
			return this;
		}
		public Builder nombre(String nombre) {
			this.cliente.nombre=nombre;
			return this;
		}
		public Builder apellido(String apellido) {
			 this.cliente.apellido=apellido;
			 return this;
		}
		public Builder dni(String dni) {
			String regex="^[0-9]{8}$";
			if(!dni.matches(regex)) {
				throw new DNIInvalidException();
			}
			this.cliente.dni=dni;
			return this;
		}
		public Builder correo(String correo) {
			if(!correo.contains("@")) {
				throw new EMailInvalidException();
			}
			this.cliente.correo=correo;
			return this;
		}
		
		
	}
	
}
