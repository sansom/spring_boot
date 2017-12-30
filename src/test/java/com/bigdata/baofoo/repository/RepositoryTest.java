/**
 * 
 */
package com.bigdata.baofoo.repository;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import com.bigdata.baofoo.BaseTest;
import com.bigdata.baofoo.domain.Book;

/**
 * @author sansom
 *
 */
public class RepositoryTest extends BaseTest {
	
	//通过spring的依赖注入将BookRepository注入进来
	@Autowired
	private BookRepository bookRepository;
	
	@Test
	public void test1() {
		
		Page<Book> books =bookRepository.findByBooks("%战争%", "世界名著", new PageRequest(0,10));


		
	}

}
