# Springboot 
### @SpringBootApplication 
- 是Spring Boot项目的核心注解，主要目的是开启自动配置
- @EnableAutoConfiguration 让Spring Boot 根据类路径中的jar包依赖为当前项目进行自动配置。
### starter pom  Spring Boot 
 - 为我们提供了简化企业开发绝大多数场景的starter pom ，
 只要使用了应用场景所需要的starter pom，相关的技术配置将会消除，
 就可以得到Spring boot为我们提供的自动配置 
 
 #### Spring Boot 集成 RabbitMQ
 - rabbitmq降低主程序线程压力,是一种非阻塞模式的分布式消息队列服务器，有生产者生产到rabbitmq，消费者消费

#### 实现自己的自动配置
