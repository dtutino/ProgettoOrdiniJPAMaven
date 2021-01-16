package it.progettoordinijpamaven.dao.ordine;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import it.progettoordinijpamaven.model.Ordine;

public class OrdineDAOImpl implements OrdineDAO {
	
	private EntityManager entityManager;
	
	@Override
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;

	}

	@Override
	public List<Ordine> list() throws Exception {
		return entityManager.createQuery("from Ordine", Ordine.class).getResultList();
	}

	@Override
	public Ordine get(Long id) throws Exception {
		return entityManager.find(Ordine.class, id);
	}

	@Override
	public void update(Ordine o) throws Exception {
		if (o == null) {
			throw new Exception("Problema valore in input");
		}
		o = entityManager.merge(o);

	}

	@Override
	public void insert(Ordine o) throws Exception {
		if (o == null) {
			throw new Exception("Problema valore in input");
		}
		entityManager.persist(o);
	}

	@Override
	public void delete(Ordine o) throws Exception {
		if (o == null) {
			throw new Exception("Problema valore in input");
		}

		// prima elimino i suoi film
		Query query = entityManager.createQuery("delete from Articolo where ordine_id = ?1");
		query.setParameter(1, o.getId()).executeUpdate();

		// e poi il regista
		entityManager.remove(entityManager.merge(o));

	}

}
