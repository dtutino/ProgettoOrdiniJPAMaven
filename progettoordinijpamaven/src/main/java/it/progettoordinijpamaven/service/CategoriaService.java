package it.progettoordinijpamaven.service;

import java.util.List;

import it.progettoordinijpamaven.dao.categoria.CategoriaDAO;
import it.progettoordinijpamaven.model.Articolo;
import it.progettoordinijpamaven.model.Categoria;

public interface CategoriaService {

	public List<Categoria> listAll() throws Exception;

	public Categoria caricaSingoloElemento(Long id) throws Exception;

	public void aggiorna(Categoria categoriaInstance) throws Exception;

	public void inserisciNuovo(Categoria categoriaInstance) throws Exception;

	public void rimuovi(Categoria categoriaInstance) throws Exception;

	public void aggiungiArticolo(Categoria categoriaInstance, Articolo articoloInstance) throws Exception;
	
	public Categoria cercaPerDescrizione(String descrizione) throws Exception;

	// per injection
	public void setCategoriaDAO(CategoriaDAO categoriaDAO);
}
