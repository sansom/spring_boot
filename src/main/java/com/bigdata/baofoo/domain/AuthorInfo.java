/**
 * 
 */
package com.bigdata.baofoo.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

/**
 * @author sansom
 *
 */
@Entity
public class AuthorInfo extends DomainImpl {
	

	
	private String school;
	
	@OneToOne(mappedBy="info")
	private Author author;


	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	

}
