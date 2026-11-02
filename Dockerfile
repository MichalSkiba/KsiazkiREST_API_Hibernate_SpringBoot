FROM maven:3.9.11-eclipse-temurin-21 AS build
WORKDIR /build
COPY pom.xml ./
COPY src ./src
RUN mvn -B --no-transfer-progress -DskipTests package

FROM eclipse-temurin:21-jre
WORKDIR /app
COPY --from=build /build/target/KsiazkiREST-0.0.1-SNAPSHOT.jar /app/app.jar
USER 10001
ENTRYPOINT ["java","-jar","/app/app.jar"]
