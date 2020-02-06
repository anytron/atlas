# atlas

### 项目结构
一期项目结构:

* 父级pom项目
* 子级提供者pom
  * 子级提供者(单个项目,后边做成分布式)
* 子级消费者pom
  * 子级消费者(单个项目,后边做成分布式+Ribbon负载均衡)
* 公共区(考虑拆分对外对内)
* 安全[最后做]
* 网关(补齐过滤各个方式)
* config[最后做]
* 监控

项目中采用的maven jar均为较高版本的配置
注意数据库采用的连接为8+版本 连接驱动会跟之前不太一样 
atlas-provider-user下的application.yml driver-class-name: com.mysql.cj.jdbc.Driver

