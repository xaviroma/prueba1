package com.codenotfound.primefaces;

import FPBasicsDB.modelo.TablaBloques;
import FPBasicsDB.servicio.impl.ServicioBloquesImpl;

import java.io.Serializable;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

@ManagedBean(name = "tablaBloquesVista")
@ViewScoped
public class tablaBloquesVista implements Serializable {

	private List<TablaBloques> bloques;

	@ManagedProperty("#{ServicioBloquesImpl}")
	private ServicioBloquesImpl servicioBloques;

	@PostConstruct
	public void init() {
		bloques = servicioBloques.consultarTodosLosRegistrosDeLaTablaBloques();
	}

	public List<TablaBloques> getCars() {
		return bloques;
	}
	
	public void setService(ServicioBloquesImpl servicioBloques) {
        this.servicioBloques = servicioBloques;
    }

}
