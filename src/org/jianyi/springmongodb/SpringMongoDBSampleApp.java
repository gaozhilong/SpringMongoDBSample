package org.jianyi.springmongodb;

import org.jianyi.springmongodb.db.SpringMongoDBConfiguration;
import org.jianyi.springmongodb.db.dao.LanguageDAOImpl;
import org.jianyi.springmongodb.db.dao.ProgrammerDAOImpl;
import org.jianyi.springmongodb.model.Language;
import org.jianyi.springmongodb.model.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author zhilong_Gao
 *
 */
public class SpringMongoDBSampleApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new AnnotationConfigApplicationContext(
				SpringMongoDBConfiguration.class);
		ProgrammerDAOImpl programmerDAOImpl = context
				.getBean(ProgrammerDAOImpl.class);
		LanguageDAOImpl languageDAOImpl = context
				.getBean(LanguageDAOImpl.class);

		Language language = new Language("golang");
		Programmer programmer = new Programmer("Bob", 30, language);

		Language language1 = new Language("java");
		Programmer programmer1 = new Programmer("Tom", 25, language);

		languageDAOImpl.create(language);
		languageDAOImpl.create(language1);
		programmerDAOImpl.create(programmer);
		programmerDAOImpl.create(programmer1);

	}

}
