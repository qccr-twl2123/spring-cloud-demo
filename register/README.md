### 服务注册中心高可用配置及部署
* 添加host配置
```text
127.0.0.1 peer1 peer2
```
* application.yml 配置
```yaml

spring:
    profiles: peer1 # 指定profile=peer1
server:
    port: 8761
eureka:
    instance:
        hostname: peer1 # 指定当profile=peer1时，主机名
    client:
        serviceUrl:
            defaultZone: http://peer2:8762/eureka/ # 将⾃⼰注册到peer2这个Eureka上⾯去
---
spring:
    profiles: peer2 # 指定profile=peer1
server:
    port: 8762
eureka:
    instance:
        hostname: peer2 # 指定当profile=peer1时，主机名
    client:
        serviceUrl:
            defaultZone: http://peer1:8761/eureka/ # 将⾃⼰注册到peer2这个Eureka上⾯去
```

```text
如开发环境和生产环境分开配置，可以使用符号---
```
* 发布脚本
```text
1. 打包
mvn clean package -Dmaven.test.skip=true

2.生成jar在target 目录下
microservice.jar

3. 发布服务
java -jar microservice.jar --spring.profiles.active=peer1
java -jar microservice.jar --spring.profiles.active=peer2
```



