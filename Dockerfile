FROM mcr.microsoft.com/java/jdk:8-zulu-alpine

ARG JAR_VERSION=0.5.0
ARG JAR_NAME="spring-boot-rest-example-${JAR_VERSION}.jar"
ARG EXPOSE_PORT="8080"

ENV JAR_NAME=${JAR_NAME}

WORKDIR /app

COPY "./target/${JAR_NAME}" "${JAR_NAME}"

EXPOSE ${EXPOSE_PORT}

CMD java -jar "${JAR_NAME}"
