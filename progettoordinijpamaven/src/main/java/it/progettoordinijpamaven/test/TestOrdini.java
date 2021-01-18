package it.progettoordinijpamaven.test;

import it.progettoordinijpamaven.dao.EntityManagerUtil;
import it.progettoordinijpamaven.model.Articolo;
import it.progettoordinijpamaven.model.Categoria;
import it.progettoordinijpamaven.model.Ordine;
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
//			initCategorie(categoriaServiceInstance);

			// ORDINE //
			// instanzio nuovi ordini
			Ordine ordineInstance = new Ordine("aaa", "bbb");
			Ordine ordineInstance2 = new Ordine("bbb", "ccc");
			Ordine ordineInstance3 = new Ordine("ddd", "eee");
			Ordine ordineInstance4 = new Ordine("fff", "ggg");
//			
			// e li inserisco
//			ordineServiceInstance.inserisciNuovo(ordineInstance);
//			ordineServiceInstance.inserisciNuovo(ordineInstance2);
//			ordineServiceInstance.inserisciNuovo(ordineInstance3);
//			ordineServiceInstance.inserisciNuovo(ordineInstance4);

//			// prendo un ordine da db
//			Ordine ordineDaDb = ordineServiceInstance.caricaSingoloElemento(4L);
//			System.out.println("Ordine preso da db: " + ordineDaDb);
//
//			// elenco tutti gli ordini
//			System.out.println("Sul db sono presenti i seguenti ordini: ");
//			for (Ordine ordineItem : ordineServiceInstance.listAll()) {
//				System.out.println(ordineItem);
//			}

			// aggiorno un ordine
//			System.out.println("ordine con id " + ordineDaDb.getId() + " prima dell'aggiornamento: " + ordineDaDb);
//			ordineDaDb.setIndirizzoSpedizione("aaa");
//			ordineServiceInstance.aggiorna(ordineDaDb);
//			System.out.println("ordine con id " + ordineDaDb.getId() + " dopo l'aggiornamento: " + ordineDaDb);

			// provo a eliminare un ordine con degli articoli
//			ordineServiceInstance.rimuovi(ordineDaDb);

			// ARTICOLO //
			// instanzio nuovi articoli
			Articolo articoloInstance = new Articolo("aaa", 18);
			Articolo articoloInstance2 = new Articolo("bbb", 24);
			Articolo articoloInstance3 = new Articolo("ccc", 6);
			Articolo articoloInstance4 = new Articolo("ddd", 50);
//			
			// e li inserisco
//			articoloServiceInstance.inserisciNuovo(articoloInstance);
//			articoloServiceInstance.inserisciNuovo(articoloInstance2);
//			articoloServiceInstance.inserisciNuovo(articoloInstance3);
//			articoloServiceInstance.inserisciNuovo(articoloInstance4);

//			// prendo un articolo da db
			Articolo articoloDaDb = articoloServiceInstance.caricaSingoloElemento(3L);
//			System.out.println("Articolo preso da db: " + articoloDaDb);

//			// elenco tutti gli articoli
//			System.out.println("Sul db sono presenti i seguenti articoli: ");
//			for (Articolo articoloItem : articoloServiceInstance.listAll()) {
//				System.out.println(articoloItem);
//			}

//			// aggiorno un articolo
//			System.out.println("Articolo con id " + articoloDaDb.getId() + " prima dell'aggiornamento: " + articoloDaDb);
//			articoloDaDb.setOrdine(ordineServiceInstance.caricaSingoloElemento(1L));
//			articoloServiceInstance.aggiorna(articoloDaDb);
//			System.out.println("Articolo con id " + articoloDaDb.getId() + " dopo l'aggiornamento: " + articoloDaDb);

//			// provo a eliminare un articolo
//			articoloServiceInstance.rimuovi(articoloDaDb);
			
			// aggiungo la categoria all'articolo
//			Articolo articoloPerCollegamento = articoloServiceInstance.caricaSingoloElemento(5L);
//			Categoria categoriaPerCollegamento = categoriaServiceInstance.caricaSingoloElemento(2L);
//			articoloServiceInstance.aggiungiCategoria(articoloPerCollegamento, categoriaPerCollegamento);

			// CATEGORIA //
			// prendo una categoria da db
//			Categoria categoriaDaDb = categoriaServiceInstance.caricaSingoloElemento(3L);
//			System.out.println("Categoria presa da db: " + categoriaDaDb);
//
//			// elenco tutte le categorie
//			System.out.println("Sul db sono presenti le seguenti categorie: ");
//			for (Categoria categoriaItem : categoriaServiceInstance.listAll()) {
//				System.out.println(categoriaItem);
//			}
			
//			// aggiorno una categoria
//			System.out.println("Categoria con id " + categoriaDaDb.getId() + " prima dell'aggiornamento: " + categoriaDaDb);
//			categoriaDaDb.setDescrizione("eBook");
//			categoriaServiceInstance.aggiorna(categoriaDaDb);
//			System.out.println("Categoria con id " + categoriaDaDb.getId() + " dopo l'aggiornamento: " + categoriaDaDb);
			
			// provo a eliminare una categoria
//			categoriaServiceInstance.rimuovi(categoriaDaDb);
			
//			// provo ad eliminare una categoria associata ad un articolo
//			categoriaServiceInstance.rimuovi(categoriaServiceInstance.caricaSingoloElemento(5L));
			
			
//			// cerco tutti gli ordini effettuati data una detrminata categoria
//			Categoria categoriaProva = categoriaServiceInstance.caricaSingoloElemento(2L);	
//			// lego un articolo ad un ordine per effettuare la ricerca
//			Ordine ordineProva = ordineServiceInstance.caricaSingoloElemento(1L);			
//			Articolo articoloProva = articoloServiceInstance.caricaSingoloElemento(5L);
//			articoloProva.setOrdine(ordineProva);
//			articoloServiceInstance.aggiorna(articoloProva);			
//			// passo la categoria come parametro del metodo 
//			// e mi dovrebbe restituire gli ordini ad essa collegati tramite gli articoli
//			System.out.println(ordineServiceInstance.trovaPerCategoria(categoriaProva));
			
			// cerco tutte le categorie degli articoli di un dato ordine
//			Ordine ordineProva = ordineServiceInstance.caricaSingoloElemento(1L);
//			System.out.println(categoriaServiceInstance.cercaPerOrdine(ordineProva));
			
			// restituisco la somma dei prezzi degli articoli collegati ad una categoria
			System.out.println(articoloServiceInstance.totalePrezzoPerCategoria(categoriaServiceInstance.caricaSingoloElemento(2L)));
			
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
