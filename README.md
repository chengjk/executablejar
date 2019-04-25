# package to executable jar

Java打包成可执行jar的几种方式，后续用到再做补充。记录下来以备后用。


## Getting Stared
所有方式都提供了各自的 `pom-xxx.xml` 文件:
- pom-assembly.xml
- pom-simple.xml
- pom-spring-boot.xml
- pom-withdep.xml
- pom-withdep-res.xml
- pom-withRes.xml

使用时，将对应的pom文件重命名成 `pom.xml`, 然后执行对应的打包命令即可,默认的pom是Assembly。打包后可以`java -jar xxx.jar` 运行。


## Usage
### Simple
`mvn clean package`
没有依赖，没有配置。
### With dependency
`mvn clean package`
有依赖，将依赖打包到 `libs` 目录。
### With resources
`mvn clean package`
有配置，将配置文件打包到跟目录。
### With dependency and resources
`mvn clean package`
前两项的综合体，将依赖打包到`libs` 同时配置打包到跟目录。
### Spring boot
spring boot 打包方式。源码直接运行 `mvn spring-boot:run` ， 打包`mvn clean package`。 打包后可直接用 `java -jar xxx.jar` 运行。
  
### Assembly
`mvn clean package assembly:single`

打包成一个独立可执行文件 `xxx-with-dependencies.jar`。 配置 assembly/distribution.xml 将 jar和配置一起打包成 zip。


`java -jar xxx.jar` for run.

