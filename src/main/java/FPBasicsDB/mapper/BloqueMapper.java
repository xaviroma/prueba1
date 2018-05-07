package FPBasicsDB.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import FPBasicsDB.modelo.TablaBloques;

public interface BloqueMapper {
	int modificarRegistroDeLaTablaBloques(@Param("bloque") TablaBloques registro);
	
	List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques();
	List<TablaBloques> consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(@Param("idBloque") Integer idResultado,@Param("empresa") Integer emmpresa);
	List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(@Param("idFormadorResponsable") Integer idFormadorResponsable);
	List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdModulo(@Param("idModulo") Integer idModulo);
}
