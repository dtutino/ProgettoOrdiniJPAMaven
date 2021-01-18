package it.progettoordinijpamaven.dao.articolo;


import java.util.List;

import it.progettoordinijpamaven.dao.IBaseDAO;
import it.progettoordinijpamaven.model.Articolo;
import it.progettoordinijpamaven.model.Categoria;

public interface ArticoloDAO extends IBaseDAO<Articolo> {

	public List<Articolo> findAllByCategoria(Categoria categoriaInput);
	
	public Long sumPriceByCategoria(Categoria categoriaInput) throws Exception;
}
