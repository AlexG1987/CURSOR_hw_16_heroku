FROM adoptopenjdk/openjdk11:alpine-jre
WORKDIR /home/app
EXPOSE 8080
ADD target/hw_16_heroku-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
CMD java -jar app.jar