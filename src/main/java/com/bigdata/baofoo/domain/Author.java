/**
 * 
 */
package com.bigdata.baofoo.domain;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.OrderBy;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author sansom
 *
 */
@Entity
public class Author extends DomainImpl {

       
       private String name;
       
       @Column(columnDefinition="INT(3)")
       private int age;
       
       //指定表内创建的时间类型
       @Temporal(TemporalType.DATE)
       private Date birthday;
       
       //当是枚举类型的时候需要使用此注解，指定存到数据库是string类型
       @Enumerated(EnumType.STRING)
       private Sex sex;
       
       //声明此对象是被注入的
       @Embedded
       private Address address;
       
       //声明集合用此注解
       @ElementCollection
       private List<String> hobbies;
       
       @ElementCollection
       private List<Address> addresses;
       
       @OneToMany(mappedBy="author")
       @OrderBy("book.name ASC")
   	   private List<BookAuthor> books;
       
       @OneToOne
       private AuthorInfo info;
       


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public List<String> getHobbies() {
		return hobbies;
	}

	public void setHobbies(List<String> hobbies) {
		this.hobbies = hobbies;
	}

	public List<Address> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<BookAuthor> getBooks() {
		return books;
	}

	public void setBooks(List<BookAuthor> books) {
		this.books = books;
	}

	public AuthorInfo getInfo() {
		return info;
	}

	public void setInfo(AuthorInfo info) {
		this.info = info;
	}


       
        
}
