FROM openjdk:8-jdk-alpine
COPY target/TlabApi-2.2.4.RELEASE.jar Tlab_API.jar
ENTRYPOINT ["java","-jar","/Tlab_API.jar"]
