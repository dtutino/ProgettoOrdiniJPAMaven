package it.progettoordinijpamaven.service;

import java.util.List;

import it.progettoordinijpamaven.dao.articolo.ArticoloDAO;
import it.progettoordinijpamaven.model.Articolo;
import it.progettoordinijpamaven.model.Categoria;

public interface ArticoloService {

	public List<Articolo> listAll() throws Exception;

	public Articolo caricaSingoloElemento(Long id) throws Exception;

	public void aggiorna(Articolo articoloInstance) throws Exception;

	public void inserisciNuovo(Articolo articoloInstance) throws Exception;

	public void rimuovi(Articolo articoloInstance) throws Exception;

	public void aggiungiCategoria(Articolo articoloInstance, Categoria categoriaInstance) throws Exception;
	
	public void creaECollegaArticoloECategoria(Articolo articoloTransientInstance, Categoria categoriaTransientInstance) throws Exception;

	public Long totalePrezzoPerCategoria(Categoria categoriaInstance) throws Exception;
	
	// per injection
	public void setArticoloDAO(ArticoloDAO articoloDAO);
}
