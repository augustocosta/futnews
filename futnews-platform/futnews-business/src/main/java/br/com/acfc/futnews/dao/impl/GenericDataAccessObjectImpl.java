package br.com.acfc.futnews.dao.impl;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import br.com.acfc.futnews.dao.IDataAccessObject;

@Repository
public abstract class GenericDataAccessObjectImpl<T, PK extends Serializable> implements IDataAccessObject<T, PK> {
	
	@PersistenceContext
	protected EntityManager entityManager;

	/**
	 * (non-Javadoc)
	 * @see org.indt.cb.phonefinder.dao.impl.IDataAccessObject#save(T)
	 */
	@Override
	public void save(T t) {
		entityManager.persist(t);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.indt.cb.phonefinder.dao.impl.IDataAccessObject#delete(T)
	 */
	@Override
	public void delete(T t) {
		entityManager.remove(t);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.indt.cb.phonefinder.dao.impl.IDataAccessObject#findByPK(T)
	 */
	@Override
	public T findByPK(Class<T> clazz, PK pk) {
		return entityManager.find(clazz, pk);
	}
	
	/**
	 * (non-Javadoc)
	 * @see org.indt.cb.phonefinder.dao.impl.IDataAccessObject#update(T)
	 */
	@Override
	public T update(T t) {
		return entityManager.merge(t);
	}
}
