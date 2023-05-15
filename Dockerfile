FROM amazoncorretto:11-alpine-jdk
MAINTAINER DAN
COPY target/ulr-0.0.1-SNAPSHOT.jar dan-app.jar
ENTRYPOINT ["java", "-jar", "/dan-app.jar"]
EXPOSE 8080
