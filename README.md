# Angular 7.2+ based CRUD + JWT authentication for lawyers management

This project goal is to build a simple CRUD frontend UI for lawyers with JWT authentication.

The identity and access management is done with keycloack. The restful API on the backend was created with SpringBoot.

The folder **backend** contains the spring boot project for the resful backend. The folder **frontend** contains the angular UI

## Implementation details

- Both folders **frontend** and **backend** have a README.md file describing implementation details, how to build, how to run, how to build Docker containers and many more .. feel free to contact me on any doubts

## Building and running with docker compose

- To build the backend, run the following command inside the **backend** folder :
`./mvnw -DskipTests=true clean package`
    As result, the file `demo-backend.jar` will be created inside the folder `target`

- ensure you have docker and the **docker-compose** tool on your machine

- Get back to the project's root dir and build the container images with `docker-compose build`
- Get up all containers with `docker-compose up`
- Wait for all the services initialize and execute the following commands:
`docker exec -i  demo-keycloak1 bash < setup_keycloak.sh`
`docker exec -i  demo-mysql mysql -u app -p123 -D crud_angular_spring_boot < backend/src/main/resources/data-mysql.sql`
- Now, you can access the angular frontend at http://localhost using the login **`user1`** and password **`1135`**

## Demo
![Demo](/demo.gif?raw=true "Demo")