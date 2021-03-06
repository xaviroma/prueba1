package FPBasicsDB.repositorio.impl;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import FPBasicsDB.mapper.ModuloMapper;
import FPBasicsDB.modelo.TablaModulos;
import FPBasicsDB.repositorio.RepositorioModulos;

@Repository
//@ManagedBean(name = "RepositorioModulosImpl")
//@ApplicationScoped
public class RepositorioModulosImpl implements RepositorioModulos {

	//@Autowired
	//private ModuloMapper mapper;
	List<TablaModulos> modulos;

//	@Autowired
//	public RepositorioModulosImpl(ModuloMapper mapper) {
//		this.mapper=mapper;
//	}
	
	
	@Override
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos() {
//		return this.mapper.consultarTodosLosRegistrosDeLaTablaModulos();
		System.out.println("estoy entrando por repositorio");
		modulos = new ArrayList<TablaModulos>();
		TablaModulos modulo1 = new TablaModulos(1, "prueba1", 150, "PR");
		TablaModulos modulo2 = new TablaModulos(2, "prueba2", 180, "SG");
		TablaModulos modulo3 = new TablaModulos(3, "prueba3", 200, "SG");
		TablaModulos modulo4 = new TablaModulos(4, "prueba4", 150, "PR");
		TablaModulos modulo5 = new TablaModulos(5, "prueba5", 180, "SG");
		TablaModulos modulo6 = new TablaModulos(6, "prueba6", 200, "SG");
		modulos.add(modulo1);
		modulos.add(modulo2);
		modulos.add(modulo3);
		modulos.add(modulo4);
		modulos.add(modulo5);
		modulos.add(modulo6);
		return modulos;
	}

	@Override
	public List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo) {
		//return this.mapper.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
		return null;
	}

	@Override
	public void modificarRegistroDeLaTablaModulos(TablaModulos registro) {
		//this.mapper.modificarRegistroDeLaTablaModulos(registro);
		
	}

	
}
