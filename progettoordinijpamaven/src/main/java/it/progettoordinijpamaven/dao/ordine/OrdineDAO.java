package it.progettoordinijpamaven.dao.ordine;

import java.util.List;

import it.progettoordinijpamaven.dao.IBaseDAO;
import it.progettoordinijpamaven.model.Categoria;
import it.progettoordinijpamaven.model.Ordine;

public interface OrdineDAO extends IBaseDAO<Ordine> {

	public List<Ordine> findAllByCategoria(Categoria categoriaInstance) throws Exception;
}
