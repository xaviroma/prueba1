package FPBasicsDB.servicio;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import FPBasicsDB.modelo.TablaBloques;


public interface ServicioBloques {
	
	List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques();
	
	List<TablaBloques> consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(Integer idResultado,Integer emmpresa);
	
	List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(Integer idFormadorResponsable);
	
	List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdModulo(Integer idModulo);

	void modificarRegistroDeLaTablaBloques(TablaBloques registro);
}