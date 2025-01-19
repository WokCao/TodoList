FROM openjdk:17-slim-buster

WORKDIR /app

COPY build/libs/TodoList-0.0.1.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]