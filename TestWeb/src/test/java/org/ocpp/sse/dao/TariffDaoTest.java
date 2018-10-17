package org.ocpp.sse.dao;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.ocpp.sse.entity.Tariff;

import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.Logger;
import org.springframework.util.Log4jConfigurer;
import java.io.FileNotFoundException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:config/spring.xml" })
public class TariffDaoTest {

    @Autowired
    public TariffDao tariffDao;

    private static final Logger logger = Logger.getLogger(TariffDaoTest.class);

	static {
		try {
			Log4jConfigurer.initLogging("classpath:config/log4j.properties");
		} catch (FileNotFoundException ex) {
			System.err.println("Cannot Initialize log4j");
		}
    }

    /**
     * 此方法只会在运行所有单元测试前执行一次, 通常用來获取数据库连接,Spring管理的Bean等等
     */
    @BeforeClass
    public static void init() {

    }

    /**
     * 此方法在每次单元测试前都会执行,   
     * 通常用来准备数据或获取单元测试依赖的数据或对象  
     */
    @Before
    public void setUp() {

    }

    /**
     * 测试类的主要方法,在这里写所有的测试业务逻辑
     */
    @Test
    public void testFindById() throws Exception {
        List<Tariff> talist = tariffDao.get("16");
        // System.out.println(tariff.toString());
        logger.debug(talist.toString());
    }

    /**
     * 此方法运行每个单元测试后都会执行, 主要用来和setUp对应,清理获取的资源
     */
    @After
    public void tearDown() {

    }

    /**
     * 此方法会在运行所有单元测试后执行一次, 通常用来释放资源,例如数据库连接,IO流等等
     */
    @AfterClass
    public static void destroy() {

    }

}
