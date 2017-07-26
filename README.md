# Leenoog工程


## IntelliJ IDEA里运行
需要在Run->Edit Configurations->VM Options里面配置参数文件路径
-Dspring.config.location=/Users/zliao/Desktop/code/github/leenoog/configuration/

## 编译
命令行下面运行
mvn clean install

## 命令行下运行
 java -jar server/target/leenoog-server-0.0.1-SNAPSHOT.jar --spring.config.location=/Users/zliao/Desktop/code/github/leenoog/configuration/application.properties