FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD spring-boot_docker_demo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]