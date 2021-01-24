# 도커 빌드, 런 커맨드
# docker build --build-arg PHASE=beta  -t quiz-back .
# docker run -it -p 8080:8080 quiz-back

FROM openjdk:8-jdk-alpine
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar

ARG PHASE
ENV SPRING_PROFILES_ACTIVE=${PHASE}

ENTRYPOINT ["java","-jar","/app.jar"]
