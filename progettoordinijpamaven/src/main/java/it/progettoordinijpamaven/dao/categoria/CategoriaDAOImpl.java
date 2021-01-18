package it.progettoordinijpamaven.dao.categoria;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import it.progettoordinijpamaven.model.Articolo;
import it.progettoordinijpamaven.model.Categoria;
import it.progettoordinijpamaven.model.Ordine;

public class CategoriaDAOImpl implements CategoriaDAO {
	
	private EntityManager entityManager;
	
	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;

	}

	@Override
	public List<Categoria> list() throws Exception {
		return entityManager.createQuery("from Categoria", Categoria.class).getResultList();
	}

	@Override
	public Categoria get(Long id) throws Exception {
		return entityManager.find(Categoria.class, id);
	}

	@Override
	public void update(Categoria o) throws Exception {
		if (o == null) {
			throw new Exception("Problema valore in input");
		}
		o = entityManager.merge(o);

	}

	@Override
	public void insert(Categoria o) throws Exception {
		if (o == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(o);

	}

	@Override
	public void delete(Categoria o) throws Exception {
		if (o == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.remove(entityManager.merge(o));

	}
	
	@Override
	public Categoria findByDescrizione(String descrizioneInput) throws Exception {
		TypedQuery<Categoria> query = entityManager
				.createQuery("select c from Categoria c where c.descrizione=?1", Categoria.class)
				.setParameter(1, descrizioneInput);
		
		return query.getResultStream().findFirst().orElse(null);
	}
	
	public List<Categoria> findAllByOrdine(Ordine ordineInstance) throws Exception {
		TypedQuery<Categoria> query = entityManager
				.createQuery("select c from Categoria c left join c.articoli a left join a.ordine o where o = :ordine", Categoria.class)
				.setParameter("ordine", ordineInstance);
		
		return query.getResultList();
	}

}
