# atlas

### 项目结构
一期项目结构:

* 父级pom项目
* 子级提供者pom
  * 子级提供者
* 子级消费者pom
  * 子级消费者
* 公共区
* 安全[最后做]
* 网关
* config[最后做]
* 监控

项目中采用的maven jar均为较高版本的配置
注意数据库采用的连接为8+版本 连接驱动会跟之前不太一样 
atlas-provider-user下的application.yml driver-class-name: com.mysql.cj.jdbc.Driver

