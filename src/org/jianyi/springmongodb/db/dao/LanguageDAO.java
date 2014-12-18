package org.jianyi.springmongodb.db.dao;

import org.jianyi.springmongodb.model.Language;

/**
 * @author zhilong_Gao
 *
 */
public interface LanguageDAO {
	
	public void create(Language language);
	
	public Language get(String id);
	
	public void update(Language language);
	
	public int delete(String id);

}
