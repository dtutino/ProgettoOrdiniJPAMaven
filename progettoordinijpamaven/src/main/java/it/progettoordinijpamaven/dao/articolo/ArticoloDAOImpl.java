package it.progettoordinijpamaven.dao.articolo;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

import it.progettoordinijpamaven.model.Articolo;
import it.progettoordinijpamaven.model.Categoria;

public class ArticoloDAOImpl implements ArticoloDAO {
	
	private EntityManager entityManager;
	
	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;

	}

	@Override
	public List<Articolo> list() throws Exception {
		return entityManager.createQuery("from Articolo", Articolo.class).getResultList();
	}

	@Override
	public Articolo get(Long id) throws Exception {
		return entityManager.find(Articolo.class, id);
	}

	@Override
	public void update(Articolo o) throws Exception {
		if (o == null) {
			throw new Exception("Problema valore in input");
		}
		o = entityManager.merge(o);

	}

	@Override
	public void insert(Articolo o) throws Exception {
		if (o == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(o);

	}

	@Override
	public void delete(Articolo o) throws Exception {
		if (o == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.remove(entityManager.merge(o));
	}
	
	public List<Articolo> findAllByCategoria(Categoria categoriaInput) {
		TypedQuery<Articolo> query = entityManager.createQuery("select a FROM Articolo a left join a.categorie c where c = :categoria", Articolo.class);
		query.setParameter("categoria", categoriaInput);
		return query.getResultList();
	}
	
	public Long sumPriceByCategoria(Categoria categoriaInput) throws Exception {
		TypedQuery<Long> query = entityManager.createQuery("select distinct sum(a.prezzoSingolo) FROM Articolo a join a.categorie c where c = :categoria", Long.class);
		query.setParameter("categoria", categoriaInput);
		
		return query.getSingleResult();
		
	}

}
