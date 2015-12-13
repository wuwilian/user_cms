package user_cms;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.lm.entity.UserEntity;
import com.lm.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)		
//表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:conf/spring.xml", "classpath:conf/applicationContext.xml"})
public class UserTest extends BaseSpringJunit{

	private static final String TESTID = "1";
	
	@Resource
	private UserService userServiceImpl;
	
//	@Before
//    public void before(){                                                                   
//        @SuppressWarnings("resource")
//        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
//                ,"classpath:conf/applicationContext.xml"});
//        userService = (UserService) context.getBean("userServiceImpl");
//    }
	
	
	@Test
	public void testGetUserEntityById(){
		UserEntity userEntity = userServiceImpl.getUserEntityById(TESTID);
		System.out.println(userEntity.toString());
		Assert.assertNotNull(userEntity);
	}
	
	@Test
	public void testInsertUser() {
		UserEntity user = new UserEntity();
		user.setEmail("w656549@163.com");
		user.setPassword("wxc656549");
		user.setSex("man");
		user.setUserId("6");
		user.setUserName("吴鑫潮");
		System.out.println(userServiceImpl.insertUserEntity(user));
		
	}
}
