package FPBasicsDB.repositorio.impl;

import java.util.List;

import FPBasicsDB.mapper.BloqueMapper;
import FPBasicsDB.modelo.TablaBloques;
import FPBasicsDB.repositorio.RepositorioBloques;

public class RepositorioBloquesImpl implements RepositorioBloques {
	private BloqueMapper mapper;
	
	public void RepositorioTablaBloques(BloqueMapper mapper) {
		this.mapper=mapper;
	}

	@Override
	public List<TablaBloques> consultarTodosLosRegistrosDeLaTablaBloques() {
		
		return this.mapper.consultarTodosLosRegistrosDeLaTablaBloques();
	}

	@Override
	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(Integer idResultado, Integer emmpresa) {
		return this.mapper.consultarRegistrosDeLaTablaBloquePorEmpresaYIdBloque(idResultado, emmpresa);
	}

	@Override
	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(Integer idFormadorResponsable) {
		return this.mapper.consultarRegistrosDeLaTablaBloquePorIdFormadorResponsable(idFormadorResponsable);

	}

	@Override
	public List<TablaBloques> consultarRegistrosDeLaTablaBloquePorIdModulo(Integer idModulo) {
		return this.mapper.consultarRegistrosDeLaTablaBloquePorIdModulo(idModulo);
	}

	@Override
	public void modificarRegistroDeLaTablaBloques(TablaBloques registro) {
		this.mapper.modificarRegistroDeLaTablaBloques(registro);
	}
	
	
}
