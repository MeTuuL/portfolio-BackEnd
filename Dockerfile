FROM amazoncorretto:20-alpine-jdk   //de que imagen partimos
MAINTAINER DAN  //quien es el dueño
COPY target/ulr-0.0.1-SNAPSHOT.jar dan-app.jar    //va a copiar el empaquetado a github    
ENTRYPOINT ["java", "-jar", "/dan-app.jar"]   //es la instruccion que se va a ejecutar primero
