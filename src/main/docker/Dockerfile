FROM openjdk:11.0.14.1-oraclelinux8
VOLUME /tmp
ADD maven/spring-boot-docker-0.0.1-SNAPSHOT.jar myapp.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/myapp.jar"]