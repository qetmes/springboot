Springboot集成Dubbo分布式框架
    a.接口工程：存放实体bean和业务接口
    b.服务提供者：业务接口的实现类并将服务暴露且注册到注册中心，调用数据持久层
        -添加依赖（dubbo，注册中心，接口工程）
        -配置服务提供者核心配置文件
    c.服务消费者：处理浏览器客户端发送的请求，从注册中心调用服务提供者所提供的服务
        -添加依赖（dubbo，注册中心，接口工程）
        -配置服务消费者核心配置文件


018-服务消费者工程-springboot工程
    1.依赖：Dubbo集成Springboot框架起步依赖
           注册中心
           接口工程
    2.在接口属性上添加注解@Reference
        @Reference(interfaceClass = StudentService.class, version = "1.0.0", check = false)
    3.配置核心配置文件:
         设置dubbo配置,唯一标识：
                spring.application.name=018-springboot-dubbo-consumer
         设置注册中心：localhost可变
                spring.dubbo.registry=zookeeper://localhost:2181

    4.在启动类上添加注解@EnableDubboConfiguion,开启Dubbo配置。