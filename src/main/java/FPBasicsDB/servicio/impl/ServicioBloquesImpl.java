package FPBasicsDB.servicio.impl;

import java.util.List;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

import org.springframework.stereotype.Service;

import FPBasicsDB.modelo.TablaBloques;
import FPBasicsDB.repositorio.RepositorioBloques;
import FPBasicsDB.servicio.ServicioBloques;

@Service
@ManagedBean(name = "ServicioBloquesImpl")
@ApplicationScoped
public class ServicioBloquesImpl implements ServicioBloques {
	
	RepositorioBloques repositorioTablaBloques;

	@Override
	public List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques() {
		return this.repositorioTablaBloques.consultarTodosLosRegistrosDeLaTablaBloques();
	}

	@Override
	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(Integer idResultado,
			Integer emmpresa) {
		return this.repositorioTablaBloques.consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(idResultado, emmpresa);
	}

	@Override
	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(Integer idFormadorResponsable) {
		return this.repositorioTablaBloques.consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(idFormadorResponsable);
	}

	@Override
	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdModulo(Integer idModulo) {
		return this.repositorioTablaBloques.consultarRegistrosDeLaTablaBloquePorIdModulo(idModulo);
	}

	@Override
	public void modificarRegistroDeLaTablaBloques(TablaBloques registro) {
		this.repositorioTablaBloques.modificarRegistroDeLaTablaBloques(registro);
	}
	
}