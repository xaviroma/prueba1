package com.codenotfound.primefaces;

import java.util.ArrayList;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import FPBasicsDB.modelo.TablaModulos;
import FPBasicsDB.servicio.impl.ServicioModulosImpl;

@ManagedBean
public class BotonModificarVista {

	TablaModulos registroModulos;

	int idModulo,duracion;
	String nombre, curso;
	
	public int getIdModulo() {
		return idModulo;
	}


	public void setIdModulo(int idModulo) {
		this.idModulo = idModulo;
		System.out.println("setid");
	}


	public int getDuracion() {
		return duracion;
	}


	public void setDuracion(int duracion) {
		this.duracion = duracion;
		System.out.println("setdur");
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
		System.out.println("setnom");
	}


	public String getCurso() {
		return curso;
	}


	public void setCurso(String curso) {
		this.curso = curso;
		System.out.println("setcur");
	}


	public void botonParaUnaPrimaria(int identificador) {
		System.out.println(identificador);
		registroModulos = this.devolverRegistro(identificador);
	}

	
	public TablaModulos devolverRegistro(int idModulo) {
		TablaModulos registro = new TablaModulos(idModulo, "prueba1", 150, "PR");
		System.out.println(registro);
		return registro;
	}
	
	public void confirmarModificacion() {
		TablaModulos registroConfirmado = new TablaModulos(idModulo,nombre,duracion,curso);
		System.out.println(registroConfirmado);
		System.out.println("TU PUTA BIDA");
	}

	public TablaModulos getRegistroModulos() {
		return registroModulos;
	}

}
