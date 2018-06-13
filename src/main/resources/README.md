日志系统:
SpringBoot默认应用Logback日志系统。
可以在application.properties中配置logging.x设置日志配置。
本项目应用Log4j2作为日志系统。
在pom.xml中的spring-boot-starter中去除Logback的依赖。
应用spring-boot-starter-log4j2,将Log4j2配置文件命名log4j2.xml或log4j2-spring.xml放置在src/main/resources下即可。
官方推荐命名为log4j2-spring.xml，以便Spring可以完全控制日志初始化。