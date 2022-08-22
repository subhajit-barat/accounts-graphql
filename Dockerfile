FROM openjdk:17-jdk-slim-buster

WORKDIR /app

COPY app/app.jar build/

WORKDIR /app/build

ENTRYPOINT java -jar app.jar
