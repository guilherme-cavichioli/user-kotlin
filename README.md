# User Kotlin
## Definition
Users crud project using postgres relational database with unit tests and integrated tests using h2.

**Programming language:** Kotlin

**Framework:** Spring boot, with the following libraries:
- Postgresql

## Quick Start
Property definition file:
```yml
server:  
  port: 8080  
  servlet:  
    context-path: /user-service  
spring:  
  datasource:  
    url: jdbc:postgresql://postgres:5432/user-db  
    username: postgres  
    password: senha  
  jpa:  
    hibernate:  
      ddl-auto: update  
    properties:  
      hibernate:  
        dialect: org.hibernate.dialect.PostgreSQLDialect
```


**Start project**
To start the project you will need to install the following dependencies:
https://docs.docker.com/engine/install/
https://docs.docker.com/compose/install/

Clone using ssh: `git clone git@github.com:guilherme-cavichioli/user-kotlin.git`
Clone using https: `git clone https://github.com/guilherme-cavichioli/user-kotlin.git`


Alter installation, run the following commands at the project root:
**docker-compose up**

**Using application**

To test the endpoints, you will need to import the collection located at the project root:

> User.postman_collection.json