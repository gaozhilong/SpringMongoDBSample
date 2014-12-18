package org.jianyi.springmongodb.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.crossstore.RelatedDocument;

/**
 * @author zhilong_Gao
 *
 */
public class Programmer extends Person {
	
	@Id
	private String id;
	
	@RelatedDocument
	private Language language;

	public Programmer(String name, int age, Language language) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}

	public Language getLanguage() {
		return language;
	}

	public void setLanguage(Language language) {
		this.language = language;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
