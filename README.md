# RabbitMQ_Demo
本地访问地址:http://localhost:15672

![RabbitMQ系统架构图](image/系统架构图.jpg)

|RabbitMQ账号|可远程登陆 |
|------|-------|
|用户名|WangJie|
|密码|wangjie123|

|RabbitMQ账号|只能本地登录|
|-----|-----|
|用户名|guest|
|密码|guest|

### Windows下RabbitMQ的安装
```
下载Erlang，地址：http://www.erlang.org/download/otp_win32_R15B.exe，双击安装即可(首先装)
下载RabbitMQ，地址：http://www.rabbitmq.com/releases/rabbitmq-server/v3.3.4/rabbitmq-server-3.3.4.exe，双击安装即可。
下载rabbit-client.jar，Java代码时需要导入。地址：http://www.rabbitmq.com/releases/rabbitmq-java-client/v3.3.4/rabbitmq-java-client-bin-3.3.4.zip
本项目使用Maven添加依赖，具体添加依赖的代码查看本项目的pom.xml
```

### 注意事项
```
Rabbit中自带的监控功能。打开网址http://localhost:55672，用户名和密码都是guest。
windows命令行中输入(以管理员方式运行)：
rabbitmq-plugins enable rabbitmq_management
然后运行下面的命令来安装：
rabbitmq-service stop
rabbitmq-service install
rabbitmq-service start
```
