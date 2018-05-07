package FPBasicsDB.repositorio;

import java.util.List;

import FPBasicsDB.modelo.TablaModulos;

public interface RepositorioModulos {
	List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();
	
	List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(Integer idModulo);
	
	void modificarRegistroDeLaTablaModulos(TablaModulos registro);
}
