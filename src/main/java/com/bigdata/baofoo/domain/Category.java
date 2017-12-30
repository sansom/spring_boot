package com.bigdata.baofoo.domain;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

//指定生成的表名,由于配置了特定命名类，需要将@Table去除。
//@Table(name="bf_Category")

//在类上加@Entity注解，声明要把Category映射到数据库里面去，形成一张表
@Entity
public class Category extends DomainImpl {

	
	//默认属性
	@Basic
	@Column(length=10,nullable=false,unique=true)
	private String name;
	
	//声明不需要在数据库添加此字段
	@Transient
	private String xxx;
	
	//使用@OneToMany会在数据库生成多余的表，通过mappedBy指定表之间的关系由Book类中的category对象来维护。
	@OneToMany(mappedBy="category")
	private List<Book> books;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getXxx() {
		return xxx;
	}
	public void setXxx(String xxx) {
		this.xxx = xxx;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	
}
