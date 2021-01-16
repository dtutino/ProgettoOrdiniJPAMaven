package it.progettoordinijpamaven.dao;

import it.progettoordinijpamaven.dao.articolo.ArticoloDAO;
import it.progettoordinijpamaven.dao.articolo.ArticoloDAOImpl;
import it.progettoordinijpamaven.dao.categoria.CategoriaDAO;
import it.progettoordinijpamaven.dao.categoria.CategoriaDAOImpl;
import it.progettoordinijpamaven.dao.ordine.OrdineDAO;
import it.progettoordinijpamaven.dao.ordine.OrdineDAOImpl;

public class MyDaoFactory {

	// rendiamo questo factory SINGLETON
	private static OrdineDAO ordineDAOInstance = null;
	private static ArticoloDAO articoloDAOInstance = null;
	private static CategoriaDAO categoriaDAOInstance = null;

	public static OrdineDAO getOrdineDAOInstance() {
		if (ordineDAOInstance == null)
			ordineDAOInstance = new OrdineDAOImpl();
		return ordineDAOInstance;
	}

	public static ArticoloDAO getArticoloDAOInstance(){
		if(articoloDAOInstance == null)
			articoloDAOInstance= new ArticoloDAOImpl();
		return articoloDAOInstance;
	}
	
	public static CategoriaDAO getCategoriaDAOInstance() {
		if (categoriaDAOInstance == null)
			categoriaDAOInstance = new CategoriaDAOImpl();
		return categoriaDAOInstance;
	}


}
