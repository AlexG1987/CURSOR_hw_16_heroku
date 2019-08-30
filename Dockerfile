FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /home/hw16
ADD target/hw_16_heroku-0.0.1-SNAPSHOT.jar hw16.jar
EXPOSE 8080
CMD java -jar hw16.jar