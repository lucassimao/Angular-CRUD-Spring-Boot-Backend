# Angular 7.2+ based CRUD + JWT authentication for lawyers management

CRUD frontend UI for lawyers with JWT authentication.

This project was generated with [Angular CLI](https://github.com/angular/angular-cli) version 7.2.3.

## Implementation Details

Source code has been written in portuguese language, but is dead simple to understand how this webapp was structured

- **src/app/seguranca** - everything related to authentication
  - src/app/seguranca/auth.guard.ts - Angular AuthGuard responsible for guard app's routes
  - src/app/seguranca/login.service.ts - Angular service for authenticating users credentials with the keycloack service and managing access token and refresh token in the browser's local storage
  - src/app/seguranca/login - Login component to collect credentials from unauthenticated users
- **src/app/advogados** - feature module for lawyers (advogados)
  - src/app/advogados/cadastro - Angular CRUD component for lawyers

## Development server

- Get the spring boot backend up running `./mvnw  spring-boot:run` inside the **backend** folder. The server will start at http://localhost:8080
- Start and setup a keycloak container instance
    - run  `docker run --rm --name keycloak -e KEYCLOAK_USER=admin -e KEYCLOAK_PASSWORD=admin -e DB_VENDOR=h2 -p 8081:8080 jboss/keycloak:6.0.1`
    - Wait the keycloak initialization
    - In the project's root folder (1 folder above this one), run `docker exec -i  keycloak bash < setup_keycloak.sh`
- You must have at least the node version 10 properly installed.
- Inside the **frontend** folder
    - run `npm install`
    - run `ng serve` to start the dev server. 
- Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.
- Use the login **user1** and the password **11235** to login 

## Build

run `ng build --prod --aot` to generate the production version on the `dist/` dir
