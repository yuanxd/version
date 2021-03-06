package com.win.knowledge.service;

import java.io.Serializable;
import java.util.Collection;

import com.win.tools.easy.platform.entity.BaseEntity;

/**
 * 服务层接口基类
 * 
 * @author 袁晓冬
 * 
 * @param <E>
 *            实体类型
 * @param <PK>
 *            主键类型
 */
public interface BaseService<E extends BaseEntity, PK extends Serializable> {
	/**
	 * 存储实体
	 * 
	 * @param entity
	 *            实体
	 * @return 主键
	 */
	public void save(E entity);

	/**
	 * 批量保存实体
	 * 
	 * @param entities
	 *            实体集合
	 * @return
	 */
	public void save(Collection<E> entities);

	/**
	 * 根据主键查询实体
	 * 
	 * @param id
	 *            主鍵
	 * @return 实体
	 */
	public E get(PK id);

	public void delete(PK id);
	public void delete(E entity);
}
