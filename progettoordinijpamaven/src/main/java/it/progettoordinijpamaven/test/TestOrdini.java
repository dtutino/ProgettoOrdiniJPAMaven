package it.progettoordinijpamaven.test;

import it.progettoordinijpamaven.dao.EntityManagerUtil;
import it.progettoordinijpamaven.model.Categoria;
import it.progettoordinijpamaven.service.ArticoloService;
import it.progettoordinijpamaven.service.CategoriaService;
import it.progettoordinijpamaven.service.MyServiceFactory;
import it.progettoordinijpamaven.service.OrdineService;

public class TestOrdini {

	public static void main(String[] args) {
		OrdineService ordineServiceInstance = MyServiceFactory.getOrdineServiceInstance();
		ArticoloService articoloServiceInstance = MyServiceFactory.getArticoloServiceInstance();
		CategoriaService categoriaServiceInstance = MyServiceFactory.getCategoriaServiceInstance();
		
		try {
			
			// inizializzo le categorie sul db
			//initCategorie(categoriaServiceInstance);
			
			
		


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// questa è necessaria per chiudere tutte le connessioni quindi rilasciare il
			// main
			EntityManagerUtil.shutdown();
		}

	}
	
	private static void initCategorie(CategoriaService categoriaServiceInstance) throws Exception {
		if (categoriaServiceInstance.cercaPerDescrizione("Elettronica") == null) {
			categoriaServiceInstance.inserisciNuovo(new Categoria("Elettronica"));
		}

		if (categoriaServiceInstance.cercaPerDescrizione("Musica") == null) {
			categoriaServiceInstance.inserisciNuovo(new Categoria("Musica"));
		}
		
		if (categoriaServiceInstance.cercaPerDescrizione("Libri") == null) {
			categoriaServiceInstance.inserisciNuovo(new Categoria("Libri"));
		}
		
		if (categoriaServiceInstance.cercaPerDescrizione("Casa") == null) {
			categoriaServiceInstance.inserisciNuovo(new Categoria("Casa"));
		}
	}

}
