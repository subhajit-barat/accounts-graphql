FROM openjdk:17-jdk-slim-buster

COPY app/app.jar build/

WORKDIR /app/build

ENTRYPOINT java -jar app.jar
