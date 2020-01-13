FROM maven:3.6.3-jdk-8 AS MAVEN_BUILD
COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build/
RUN mvn package

FROM openjdk:8-jdk-alpine
WORKDIR /app
COPY --from=MAVEN_BUILD /build/target/KsiazkiREST-0.0.1-SNAPSHOT.jar /app/
ENTRYPOINT ["java", "-jar", "KsiazkiREST-0.0.1-SNAPSHOT.jar"]