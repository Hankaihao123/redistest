package cn.redis.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.redis.test.utils.RedisUtil;
import cn.redis.test.utils.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring/spring-bean.xml", "classpath:spring/spring-redis.xml" })
public class TestRedis2 {
	@Autowired
	RedisUtil redisUtil;

	@Test
	public void testredis() {
		// User user = new User("韩凯浩", 24, "河南省郑州市区", 10.5, 10f);
		// redisUtil.set("user", user);
		User user = (User) redisUtil.get("user");
		System.out.println(user.toString());

	}
}
