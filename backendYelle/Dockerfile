FROM openjdk:22-jdk-slim
WORKDIR .
ARG JAR_FILE=yelle-Yelle-0.0.1.jar
COPY ${JAR_FILE} yelle.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","yelle.jar"]
