CREATE DATABASE
IF NOT EXISTS keycloak_db;

CREATE DATABASE
IF NOT EXISTS crud_angular_spring_boot;

CREATE USER 'keycloak'@'%' IDENTIFIED BY 'keycloak123';

GRANT ALL PRIVILEGES ON keycloak_db.* TO 'keycloak'@'%'
WITH
GRANT OPTION;

GRANT ALL PRIVILEGES ON crud_angular_spring_boot.* TO 'app'@'%' WITH GRANT OPTION;
