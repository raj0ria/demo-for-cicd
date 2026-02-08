FROM eclipse-temurin:21-jdk-alpine

# create app directory
WORKDIR /app

# copy jar file
COPY target/*.jar app.jar

#expose port
EXPOSE 8080

# Run app
ENTRYPOINT ["java", "-jar", "app.jar"]