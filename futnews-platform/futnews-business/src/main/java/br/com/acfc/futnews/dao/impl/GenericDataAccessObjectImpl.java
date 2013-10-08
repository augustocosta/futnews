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
	 * {@inheritDoc}
	 */
	@Override
	public void save(T t) {
		entityManager.persist(t);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public void delete(T t) {
		entityManager.remove(t);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public T findByPK(Class<T> clazz, PK pk) {
		return entityManager.find(clazz, pk);
	}
	
	/**
	 * {@inheritDoc}
	 */
	@Override
	public T update(T t) {
		return entityManager.merge(t);
	}
}
