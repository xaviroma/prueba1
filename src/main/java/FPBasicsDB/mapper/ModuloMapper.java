package FPBasicsDB.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import FPBasicsDB.modelo.TablaModulos;

public interface ModuloMapper {
	
	public int modificarRegistroDeLaTablaModulos(@Param("modulo")TablaModulos registro);	
	
	public List<TablaModulos> consultarTodosLosRegistrosDeLaTablaModulos();

	public List<TablaModulos> consultarRegistrosDeLaTablaModulosPorIdModulo(@Param("idModulo")Integer idModulo) ;

}
