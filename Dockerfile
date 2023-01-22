FROM openjdk:17-jdk-slim
MAINTAINER kosta.palash@gmail.com
COPY target/readsecret-0.0.1-SNAPSHOT.jar readsecret-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/readsecret-0.0.1-SNAPSHOT.jar"]