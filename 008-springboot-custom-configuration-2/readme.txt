springboot将核心配置文件中的自定义配置映射到一个对象。

使用到核心配置类注解
@ConfigurationProperties(prefix = "abc")
其中prefix代表核心配置文件中自定义配置的前缀。