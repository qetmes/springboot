SpringBoot工程下使用 Mybatis反向工程
利用反向工程，可以自动生成mapper,model
步骤：
1. 配置GeneratorMapper.xml文件
2. 插入mybatis逆向工程的插件
3. maven中进行编译


使用了一个新的注解@Mapper，相当于扫描器，扫描DAO接口到spring容器