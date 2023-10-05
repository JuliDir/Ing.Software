FROM eclipse-temurin:17

WORKDIR /app

COPY target/Envio-0.0.1-SNAPSHOT.jar /app/Envio-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "springboot-docker-demo.jar"]
