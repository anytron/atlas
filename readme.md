# atlas

## 项目记录

|    时间    |        事件        |
| :--------: | :----------------: |
| 2020-02-05 | 项目创建完成P1内容 |
| 2020-02-11 |     启动P2内容     |
|            |                    |



## 项目结构
### P1项目内容:

* 父级pom项目[提供基础maven配置]
* `Eureka`服务
* 子级提供者pom[提供提供者专用maven配置,如web,db连接等]
  
  * 子级提供者-单个项目
  * 分布式的话启动方式指定不同的server point来完成多个提供者注册
* 子级消费者pom[提供消费者专用maven配置,如web,`Feign`,`Ribbon`等]
  
  * 子级消费者-单个项目
  * 分布式的话启动方式指定不同的server point来完成多个消费者注册后边补充`Ribbon`负载均衡)
* 公共区[考虑拆分对外对内]
* 网关[补齐过滤各个方式,补充负载均衡]
* 监控[spring cloud admin]

#### 注意

1. 项目中采用的maven jar均为较高版本的配置
2. 注意数据库采用的连接为8+版本 连接驱动会跟之前不太一样
3. atlas-provider-user下的application.yml driver-class-name: com.mysql.cj.jdbc.Driver

#### 关于安全`Spring Cloud Security`

`Spring Cloud Security`提供了一组原语，用于构建安全的应用程序和服务，而且操作简便。可以在外部（或集中）进行大量配置的声明性模型有助于实现大型协作的远程组件系统，通常具有中央身份管理服务。它也非常易于在Cloud Foundry等服务平台中使用。在`Spring Boot`和`Spring Security OAuth2`的基础上，可以快速创建实现常见模式的系统，如单点登录，令牌中继和令牌交换。

功能：

    从Zuul代理中的前端到后端服务中继SSO令牌
    资源服务器之间的中继令牌
    使Feign客户端表现得像OAuth2RestTemplate（获取令牌等）的拦截器
    在Zuul代理中配置下游身份验证
### P2项目内容:

- 安全[`Spring Cloud Security`最后做]_(:з」∠)_

- Spring Cloud Config[最后做]