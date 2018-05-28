package com.codenotfound.primefaces;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.*;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import FPBasicsDB.modelo.TablaModulos;
import FPBasicsDB.servicio.impl.ServicioModulosImpl;

@ManagedBean
@ViewScoped
public class TablaModulosVista implements Serializable {
	private List<TablaModulos> modulos;

	@ManagedProperty("#{ServicioModulosImpl}")
	public ServicioModulosImpl service;

	@PostConstruct
	public void init() {
		modulos = new ArrayList<>();
		modulos.addAll(service.consultarTodosLosRegistrosDeLaTablaModulos());
	}

	public List<TablaModulos> getModulos() {
		return modulos;
	}

	public void setService(ServicioModulosImpl service) {
		this.service = service;
	}


}