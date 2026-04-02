# Use lightweight Java image
FROM eclipse-temurin:8-jdk-jammy
# Set working directory
WORKDIR /app

# Copy jar file
COPY target/journalApp-0.0.1-SNAPSHOT.jar app.jar

# Expose port
EXPOSE 8080

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]
