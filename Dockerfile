FROM java:21

EXPOSE 8085

ADD target/employee-microservice-0.0.1-SNAPSHOT.jar  employee-microservice.jar

ENTRYPOINT ["java","-jar", "employee-microservice.jar"]
