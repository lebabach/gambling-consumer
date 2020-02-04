FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/gamblingconsumer-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} gamblingconsumer-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/gamblingconsumer-0.0.1-SNAPSHOT.jar"]
