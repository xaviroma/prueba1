package FPBasicsDB.servicio.impl;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import FPBasicsDB.modelo.TablaModulos;
import FPBasicsDB.repositorio.impl.RepositorioModulosImpl;
import FPBasicsDB.repositorio.impl.aj;
import FPBasicsDB.servicio.ServicioModulos;


@Service
@ManagedBean(name = "ServicioModulosImpl")
@ApplicationScoped
public class ServicioModulosImpl implements ServicioModulos {
	
	//@Autowired
	//@ManagedProperty("#{RepositorioModulosImpl}")
	public RepositorioModulosImpl repositorioModulos = new RepositorioModulosImpl();
//	
	List<TablaModulos> modulos;	
	
//	@Autowired
//	public ServicioModulosImpl(RepositorioModulosImpl repositorioModulos) {
//		this.repositorioModulos=repositorioModulos;
//	}

	@Override
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos() {

		return repositorioModulos.consultarTodosLosRegistrosDeLaTablaModulos(); 
	}
	
	@Override
	public List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo) {
		//return repositorioModulos.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
		TablaModulos registro1 = new TablaModulos(idModulo, "prueba1", 150, "PR");
		modulos.add(registro1);
		return modulos;
	}
	
	@Override
	public void modificarRegistroDeLaTablaModulos(TablaModulos registro) {
		//this.repositorioTablaModulos.modificarRegistroDeLaTablaModulos(registro);	
	}

}