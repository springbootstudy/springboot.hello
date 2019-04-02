
本工程搭建一个spring boot项目

docker 使用方式

mvn  clean package dockerfile:build 

mvn  clean package dockerfile:build dockerfile:push

http://localhost:8000

http://localhost:8000/index/

启用 swagger 的方式
pom.xml 中添加 swagger 的依赖
com.ctsi.springboot.tomcat.config.SwaggerConfig 文件中启用
启动程序后，http://localhost:8000/swagger-ui.html 就可以看到接口
此示例中没有任何的修饰，全是默认方式
