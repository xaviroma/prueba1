package FPBasicsDB.servicio;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import FPBasicsDB.modelo.TablaModulos;

public interface ServicioModulos {
	
	List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();
	
	List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo);
	
	void modificarRegistroDeLaTablaModulos(TablaModulos registro);
}
