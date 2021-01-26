# 도커 빌드, 런 커맨드
# docker build --build-arg PHASE=beta  -t quiz-back .
# docker run -it -p 8080:8080 quiz-back

FROM gradle:6.8.1-jdk8 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle bootjar

FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

ARG PHASE
ENV SPRING_PROFILES_ACTIVE=${PHASE}

EXPOSE 8080
ENTRYPOINT ["java","-jar","/app.jar"]
