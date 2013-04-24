package br.com.acfc.futnews.dao;

import java.io.Serializable;

public interface IDataAccessObject <T, PK extends Serializable> {
	
	/**
	 * Save a object
	 * 
	 * @param t The object to be saved
	 */
	void save(T t);
	
	/**
	 * Delete a object
	 * 
	 * @param t The object to be deleted
	 */
	void delete(T t);
	
	/**
	 * Find a object by primary key
	 * 
	 * @param pk The primary key
	 * @return
	 */
	T findByPK(Class<T> clazz, PK pk);
	
	/**
	 * Update a object
	 * 
	 * @param t The object to be updated
	 * @return
	 */
	T update(T t);	
}
