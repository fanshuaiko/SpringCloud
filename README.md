# springcloud微服务

### feign 是负载均衡服务
    其中还包括Hystrix熔断器
### client 和 client3 服务
    内容是相同的，并且在注册中心注册的名字都是client，这两个服务的主要作用是为了测试负载均衡
### zuul是路由网关服务
### eureka是注册中心
### conf是配置中心
    配置文件放在github的springcloud-conf-test仓库中，除了conf-client依赖conf服务，其他都不依赖conf服务，也就是说使用其他服务可以不启动conf服务，一般项目都要依赖conf配置中心，但是本项目只是简单demo，所以只做了conf-client使用conf服务来演示其功能即可
### conf-client
    主要是为了测试conf服务
###启动顺序
    1.eureka
    2.conf
    3.conf-client
    4.client、client3
    5.feign
    6.zuul
    
