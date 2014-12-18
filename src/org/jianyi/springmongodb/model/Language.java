package org.jianyi.springmongodb.model;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;

/**
 * @author zhilong_Gao
 *
 */
public class Language {
	
	@Id
	private String id;
	
	private String name;

	public Language(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}

}
