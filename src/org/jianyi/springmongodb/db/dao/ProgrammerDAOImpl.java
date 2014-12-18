package org.jianyi.springmongodb.db.dao;

import org.jianyi.springmongodb.model.Programmer;
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
public class ProgrammerDAOImpl implements ProgrammerDAO {
	
	private MongoTemplate mongoTemplate;
	private static final String PROGRAMMER_COLLECTION = "Programmer";

	public MongoTemplate getMongoTemplate() {
		return mongoTemplate;
	}

	@Autowired
	public void setMongoTemplate(MongoTemplate mongoTemplate) {
		this.mongoTemplate = mongoTemplate;
	}

	@Override
	public void create(Programmer programmer) {
		// TODO Auto-generated method stub
		this.mongoTemplate.insert(programmer, PROGRAMMER_COLLECTION);
	}

	@Override
	public Programmer get(String id) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(id));
		return this.mongoTemplate.findOne(query, Programmer.class, PROGRAMMER_COLLECTION);
	}

	@Override
	public void update(Programmer programmer) {
		// TODO Auto-generated method stub
		this.mongoTemplate.save(programmer, PROGRAMMER_COLLECTION);
	}

	@Override
	public int delete(String id) {
		// TODO Auto-generated method stub
		Query query = new Query(Criteria.where("_id").is(id));
		WriteResult result = this.mongoTemplate.remove(query, Programmer.class, PROGRAMMER_COLLECTION);
		return result.getN();
	}

}
