# For Java 11, 
FROM adoptopenjdk/openjdk11:alpine-jre

ARG JAR_FILE=jenkins-for-testing-0.0.1-SNAPSHOT.jar

WORKDIR /opt/app

# Copy the spring-boot-api-tutorial.jar from the maven stage to the /opt/app directory of the current stage.
COPY ./target/${JAR_FILE} /opt/app/
RUN chmod 700 ./jenkins-for-testing-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","jenkins-for-testing-0.0.1-SNAPSHOT.jar"]
