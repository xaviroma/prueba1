package FPBasicsDB.servicio.impl;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import FPBasicsDB.modelo.TablaModulos;
import FPBasicsDB.repositorio.impl.RepositorioModulosImpl;
import FPBasicsDB.servicio.ServicioModulos;

//@Service
@ManagedBean(name = "ServicioModulosImpl")
@ApplicationScoped
public class ServicioModulosImpl implements ServicioModulos {
	
	@ManagedProperty("#{RepositorioModulosImpl}")
	private RepositorioModulosImpl repositorioTablaModulos;
	
//	
//	@Autowired
//	public ServicioModulosImpl(RepositorioModulos repositorioTablaModulos) {
//		super();
//		this.repositorioTablaModulos = repositorioTablaModulos;
//	}
	
	@Override
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos() {
		return this.repositorioTablaModulos.consultarTodosLosRegistrosDeLaTablaModulos();
	}

	@Override
	public List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo) {
		return this.repositorioTablaModulos.consultarRegistrosDeLaTablaModulosPorIdModulo(idModulo);
	}
	
	@Override
	public void modificarRegistroDeLaTablaModulos(TablaModulos registro) {
		this.repositorioTablaModulos.modificarRegistroDeLaTablaModulos(registro);	
	}

}