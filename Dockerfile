# Base JDK image
FROM openjdk:17-jdk-slim

# Project copy to image
COPY target/HotelSampleApplication-0.0.2-SNAPSHOT.jar /app/hotelApp.jar

# Expose the front-end and backend ports (not necessary if exposing later)
EXPOSE 8080 4200

# Run the app when image starts
CMD ["java","-jar","/app/hotelApp.jar"]