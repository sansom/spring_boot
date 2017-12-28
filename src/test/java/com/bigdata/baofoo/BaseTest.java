package com.bigdata.baofoo;



import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

//声明使用SpringRunner进行测试
@RunWith(SpringRunner.class)

//测试用例入口
@SpringBootTest(classes=BookShopApplication.class)

//声明所有数据库语句测试使用事务
@Transactional

public class BaseTest {

	
}
