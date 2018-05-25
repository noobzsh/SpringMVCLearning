# SpringMVC

idea创建集成项目时必须使用
![image](http://github.com/nobzshSpringMVCLearning/images/right.png)
不能使用
![image](http://github.com/nobzshSpringMVCLearning/images/wrong.png)
否则报错，无法部署

pom文件必须及时更新，spring等配置文件需要用到pom中注册的依赖。
<groupId>和<artifactId>注意和项目创建时保持一致
 
idea部署到tomocat中必须通过artifact将war exploded部署到deployment中，方可成功运行
