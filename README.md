# Angular 7.2+ based CRUD + JWT authentication for lawyers management

This project goal is to build a simple CRUD frontend UI for lawyers with JWT authentication.
The identity and access management is done with keycloack.
The restful API on the backend was created with SpringBoot.

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 7.2.3.

## Implementation Details

TODO

## Development server

Run `./run-dev.sh` in order to get up the spring boot backend server on localhost:8080

## Build

Run `./build.sh` in order to package the spring boot backend server. The script will generate the file ./backend/target/demo-backend.jar

To run with the development configurations, just run `java -jar ./backend/target/demo-backend.jar`.
To run with the production profile, run `java -jar -Dspring.profiles.active=production ./backend/target/demo-backend.jar`


## Running unit tests

Inside the folder `backend` just run `mvn test`

## Running end-to-end tests

TODO
