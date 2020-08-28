# Spring Boot Web Template
Ayzek Studio Spring Boot Web Template

Spring modules used in this repo: 
- Spring Boot
- Spring Data/JPA
- Spring Security
- Thymeleaf
- Actuator

Other technologies useed:
- Apache Maven
- Project Lombok
- Mapstruct
- Bootstrap
- MySQL

## Instalation
1. Generate database. Scripts should be in */src/database/*
2. Duplicate application.properties.sample located in */src/main/resources/*
3. Remove the .sample from the duplicated file to have a application.properties and replace the database connection string and password
4. Install project\
`$ mvn clean install`
6. Run Spring Boot service\
`$ mvn spring-boot:run`\
In case you want to debug you can uso the command\
`$ mvn spring-boot:run -Dspring-boot.run.fork=false`

