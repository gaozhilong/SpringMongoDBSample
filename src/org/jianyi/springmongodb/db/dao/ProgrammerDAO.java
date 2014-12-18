package org.jianyi.springmongodb.db.dao;

import org.jianyi.springmongodb.model.Programmer;

/**
 * @author zhilong_Gao
 *
 */
public interface ProgrammerDAO {

	public void create(Programmer programmer);
	
	public Programmer get(String id);
	
	public void update(Programmer programmer);
	
	public int delete(String id);

}
