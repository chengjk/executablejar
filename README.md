# package to executable jar

java 打包成可执行jar的几种方式，打包结果可以 `java -jar xxx.jar` 运行。记录下来以备后用。

## simple
`mvn clean package`
没有依赖，没有配置。
## with dependency
`mvn clean package`
有依赖，将依赖打包到 `libs` 目录。
## with resources
`mvn clean package`
有配置，将配置文件打包到跟目录。
## with dependency and resources
`mvn clean package`
前两项的综合体，将依赖打包到`libs` 同时配置打包到跟目录。
## spring boot
spring boot 打包方式。源码直接运行 `mvn spring-boot:run` ， 打包`mvn clean package`。 打包后可直接用 `java -jar xxx.jar` 运行。
  
## assembly
`mvn clean package assembly:single`

打包成一个独立可执行文件 `xxx-with-dependencies.jar`。 配置 assembly/distribution.xml 将 jar和配置一起打包成 zip。


`java -jar xxx.jar` for run.

