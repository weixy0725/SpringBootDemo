SpringBoot默认了静态资源存放位置，定义了存放在下列目录下的资源可以触发实时加载：

/META-INF/maven
/META-INF/resources
/resources
/static
/public
/templates 

可以通过 spring.resources.staticLocations 属性自定义静态资源存放的位置。
SpringBoot可以静态资源路径下的index.html作为应用主页。 
