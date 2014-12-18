package org.jianyi.springmongodb.db.dao;

import org.jianyi.springmongodb.model.Language;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import com.mongodb.WriteResult;

/**
 * @author zhilong_Gao
 *
 */
@Component
public class LanguageDAOImpl implements LanguageDAO {
	
	private MongoTemplate mongoTemplate;
	private static final String LANGUAGE_COLLECTION = "Language";

	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	@Autowired
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public void create(Language language) {
		// TODO Auto-generated method stub
		this.mongoTemplate.insert(language, LANGUAGE_COLLECTION);
	}

	@Override
	public Language get(String id) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(id));
		return this.mongoTemplate.findOne(query, Language.class, LANGUAGE_COLLECTION);
	}

	@Override
	public void update(Language language) {
		// TODO Auto-generated method stub
		this.mongoTemplate.save(language, LANGUAGE_COLLECTION);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(id));
		WriteResult result = this.mongoTemplate.remove(query, Language.class, LANGUAGE_COLLECTION);
		return result.getN();
	}

}
