package com.dl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
//@ImportResource(locations = "classpath:beans.xml")
@RestController
public class OpenAutoconfigPrincipleApplication {

    @Autowired
    private RedisTemplate redisTemplate;


    public static void main(String[] args) {
        SpringApplication.run(OpenAutoconfigPrincipleApplication.class, args);
    }


    @RequestMapping("/testRedis")
    public String testRedis() {
        redisTemplate.opsForValue().set("aba","123456");
        return "OK";
    }

    	@Bean //为了解决保存使用jdk的序列方式才配置的)
	public RedisTemplate<Object, Object> redisTemplate(RedisConnectionFactory redisConnectionFactory)  {
		RedisTemplate<Object, Object> template = new RedisTemplate<>();
		template.setDefaultSerializer(new Jackson2JsonRedisSerializer<Object>(Object.class));
		template.setConnectionFactory(redisConnectionFactory);
		return template;
	}
}
