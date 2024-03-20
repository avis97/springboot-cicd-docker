FROM eclipse-temurin:17-jdk-alpine
COPY target/docker-0.0.1-SNAPSHOT.jar docker-0.0.1-SNAPSHOT.jar
EXPOSE 8085
CMD ["java","-jar","docker-0.0.1-SNAPSHOT.jar"]