
<!-- ABOUT THE PROJECT -->
## About The Project
A simple REST API template leveraging JPA with Postgres database.



### Built With

* MAVEN
* Springboot
* Java 17
* Docker
* Postgres
* H2

<p align="right">(<a href="#top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Getting Started

Please follow the below steps to play around with the template

### Prerequisites

A simple how to list things you need to use the software and how to install them.
* CLEAN BUILD (in root folder enter the below command)
  ```sh
  ./mvnw clean install
  ```
* Docker (in root folder enter the below command). This will bring up the containerised postgres databse on default ports
  ```sh
  docker-compose up -d
  ```
* RUN (in root folder)
  ```sh
  ./mvnw spring-boot:run
  ```

### Test API

1. Ensure you have postman or a terminal with cURL capability
2. Once the application has started, please fire a request like below
    ```
   GET http://localhost:8090/clubs/get-info
   ```

   ```sh
   curl -X GET http://localhost:8090/clubs/get-info
   ```
