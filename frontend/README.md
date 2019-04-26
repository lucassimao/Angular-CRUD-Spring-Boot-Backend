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

You must have at least the node version 10 properly installed.
Run `npm install`
Run `ng serve` for a dev server. Navigate to `http://localhost:4200/`. The app will automatically reload if you change any of the source files.

## Build

run `ng build --prod --aot` to generate the production version on the `dist/` dir

## How to build a docker image

`ng build --prod --aot`
`docker build -t demo-frontend .`
`docker run --rm -it -p 80:80 --name demo-frontend demo-frontend`

## Running unit tests

Run `ng test` to execute the unit tests via [Karma](https://karma-runner.github.io).

## Running end-to-end tests

Run `ng e2e` to execute the end-to-end tests via [Protractor](http://www.protractortest.org/).
