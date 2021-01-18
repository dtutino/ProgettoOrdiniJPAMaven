package it.progettoordinijpamaven.service;

import java.util.List;

import it.progettoordinijpamaven.dao.ordine.OrdineDAO;
import it.progettoordinijpamaven.model.Categoria;
import it.progettoordinijpamaven.model.Ordine;

public interface OrdineService {

	public List<Ordine> listAll() throws Exception;

	public Ordine caricaSingoloElemento(Long id) throws Exception;

	public void aggiorna(Ordine ordineInstance) throws Exception;

	public void inserisciNuovo(Ordine ordineInstance) throws Exception;

	public void rimuovi(Ordine ordineInstance) throws Exception;
	
	public List<Ordine> trovaPerCategoria(Categoria categoriaInstance) throws Exception;

	// per injection
	public void setOrdineDAO(OrdineDAO ordineDAO);
}
