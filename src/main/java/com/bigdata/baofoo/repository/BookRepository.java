/**
 * 
 */
package com.bigdata.baofoo.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.bigdata.baofoo.domain.Book;

/**
 * @author sansom
 *
 */
//创建一个操作数据库的接口，Repository<Book,Long > 指明需要操作的表实体类是Book，主键类型是Long
public interface BookRepository extends JpaRepository<Book,Long > {

	//这里可以写标准的SQL 可以写SELECT 可以指定字段，也可以不写
	@Query("select b from Book b where b.name like ?1 and b.category.name =?2 order by b.name desc")
	Page<Book> findByBooks(String bookname,String categoryName, Pageable sort);

	/**
	 * @Query不仅仅可以面向对象的语句，还可以真正的SQL语句
	 * 语法如下：
	 * @Query(value="update Book b  set b.name=?1 where b.id=2?",nativeQueary=true)
	 * 必须注明nativeQueary=true，代表执行真正的SQL，默认为false
	 * @param bookname
	 * @param bookId
	 * @return
	 */
	//@Query不仅仅可以写查询还可以更新或者删除语句，但是要跟上@Modifying注解
	@Query("update Book b  set b.name=?1 where b.id=2?")
	@Modifying
	int findByBooks(String bookname,Long bookId);


	
}
