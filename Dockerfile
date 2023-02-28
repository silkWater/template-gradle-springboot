FROM openjdk:11

RUN mkdir /app
WORKDIR /app

ADD ./build/libs/template-0.0.1-SNAPSHOT.war /app/app.war

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.war"]
