FROM openjdk:8
COPY target/*.jar /app.jar

EXPOSE 80

ENTRYPOINT ["java"]
CMD ["-jar", "/app.jar"]