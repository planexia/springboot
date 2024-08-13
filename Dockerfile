FROM amazoncorretto:21-alpine-jdk

COPY target/planexia.sa.33.spring-0.0.1-SNAPSHOT.jar app2.jar

ENTRYPOINT [ "java", "-jar" , "/app2.jar" ]