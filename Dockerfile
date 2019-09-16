FROM openjdk:8
ADD target/hw_16_heroku-0.0.1-SNAPSHOT.jar hw_16_heroku-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "hw_16_heroku-0.0.1-SNAPSHOT.jar"]