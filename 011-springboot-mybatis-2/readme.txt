在mapper文件夹中的@Mapper注解可以使用@MapperScan()注解替换

@MapperScan放在开启类的上边，并指定扫描文件夹。


总结：Springboot集成Mybatis，最主要的就是两个注解：@Mapper,@MapperScan
@Mapper 需要在每一个Mapper接口类上添加，作用扫描dao接口。
@MapperScan 是在Springboot启动入口类上添加的，它是扫描所有的包。

关于Mapper映射文件存放位置的写法有两种：
1.将Mapper接口和Mapper映射文件存放到src/main/java同一目录下，
  还需要在pom文件中手动指定资源文件夹路径resources

2.将Mapper接口和Mapper映射文件分开存放
    Mapper接口类存放到src/main/java目录下
    Mapper映射文件存放到resources(类路径)，
    并在springboot核心配置文件中指定mapper映射文件存放的位置，(mybatis.mapper-locations=);