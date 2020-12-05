# Start with a base image containing Java runtime
FROM java:8

# Make port 7777 available outside to access this container
EXPOSE 7777

ADD target/spring-boot-docker-maven.jar spring-boot-docker-maven.jar

#Run the jar file
ENTRYPOINT ["java", "-jar", "spring-boot-docker-maven.jar"]
