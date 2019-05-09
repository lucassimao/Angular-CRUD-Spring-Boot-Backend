# Spring boot based CRUD for lawyers management

Restful backend for create, update, delete and list lawyers.
In the default (development) profile, the backend runs the src/main/resources/data.sql script
to prepopulate the H2 Database. When running inside the docker container the production mode is activated and the environment variables override the database properties to connect to a running mysql instance

## Implementation Details

Source code was written in portuguese language, but is dead simple to understand how it is structured

- **src/main/java/br/jus/trt22/demo/config** package contains spring beans customizing the runtime context
- **src/main/java/br/jus/trt22/demo/modelo** package contains the entity class Advogado (lawyer)
- **src/main/java/br/jus/trt22/demo/repositorio** package contains the restful controller for the Advogado entity

# How to run in development mode

You must have the JDK >= 9 properly installed on your machine.
Just run either `mvnw.cmd spring-boot:run` (on Windows machine) or `mvnw spring-boot:run` (on a linux machine)

# How to build

Run `./mvnw clean package` in order to package the spring boot backend server. The script will generate the file ./target/demo-backend.jar

To run with the development configurations, just run `./mvnw spring-boot:run`.
To run with the production profile:
    First, run `./mvnw clean package`
    Finally, run `java -jar -Dspring.profiles.active=production ./target/demo-backend.jar`