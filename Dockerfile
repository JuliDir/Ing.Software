FROM amazoncorretto:17-alpine-jdk

COPY target/Envio-0.0.1-SNAPSHOT

ENTRYPOINT ["java","-jar","/app.jar"]
