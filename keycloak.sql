CREATE DATABASE
IF NOT EXISTS keycloak_db;

CREATE USER 'keycloak'@'%' IDENTIFIED BY 'keycloak123';

GRANT ALL PRIVILEGES ON keycloak_db.* TO 'keycloak'@'%'
WITH
GRANT OPTION;
