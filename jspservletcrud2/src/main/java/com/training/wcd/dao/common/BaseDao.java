package com.training.wcd.dao.common;

import java.util.List;
public interface BaseDao<T> {

/**
 * Find an entity by ID
 * @param id
 * @return
 */
 T find(Integer id);

/**
 * Return the list of all entities in the DB
 * @return
 */
 List<T> findAll();

/**
 * Save the entity into DB
 * @param object
 * @return
 */
 T save(T object);

/**
 * Deelete the entity identified by ID
 * @param id
 */
void delete(Integer id);
}
