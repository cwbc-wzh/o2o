package com.atwzh.o2o;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * 配置spring与Junit整合，Junit启动时加载springIOC容器
 * @author Administrator
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
//告诉junit spring的配置文件的位置
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class BaseTest {
	
}
