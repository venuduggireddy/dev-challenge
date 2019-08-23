FROM openjdk
MAINTAINER Venu Duggireddy <venu.duggireddy.fp@perspecta.com>
ADD target/api-0.0.1-SNAPSHOT.jar application.jar
ENTRYPOINT ["java", "-jar", "/application.jar"]
EXPOSE 8080