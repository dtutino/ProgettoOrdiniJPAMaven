package it.progettoordinijpamaven.dao.categoria;

import it.progettoordinijpamaven.dao.IBaseDAO;
import it.progettoordinijpamaven.model.Categoria;

public interface CategoriaDAO extends IBaseDAO<Categoria> {

	Categoria findByDescrizione(String descrizione) throws Exception;

}
