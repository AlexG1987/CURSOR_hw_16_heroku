FROM alpine

RUN apk	add openjdk8 \
	maven \
	curl \
	bash
	
VOLUME /home/hw_16

WORKDIR /home/hw_16

copy ./ /home/hw_16

ARG JAR_FILE=target/hw_16_heroku-0.0.1-SNAPSHOT.jar

ADD ${JAR_FILE} hw_16.jar

EXPOSE 8080

CMD java -jar hw_16.jar