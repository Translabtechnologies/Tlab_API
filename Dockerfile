FROM openjdk:8-jdk-alpine
COPY target/docker-Tlab_API.jar Tlab_API.jar
ENTRYPOINT ["java","-jar","/Tlab_API.jar"]
