package it.progettoordinijpamaven.dao.categoria;

import java.util.List;

import it.progettoordinijpamaven.dao.IBaseDAO;
import it.progettoordinijpamaven.model.Categoria;
import it.progettoordinijpamaven.model.Ordine;

public interface CategoriaDAO extends IBaseDAO<Categoria> {

	public Categoria findByDescrizione(String descrizione) throws Exception;
	
	public List<Categoria> findAllByOrdine(Ordine ordineInstance) throws Exception;

}
