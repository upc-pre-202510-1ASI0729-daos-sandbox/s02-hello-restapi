# s02-hello-restapi

A simple Spring Boot application demonstrating a RESTful API for performing standard functions on a songs database. 

## Features
- **GET /api/songs**: Retrieve all songs.
- **POST /api/songs**: Create a song with a JSON request body containing `title`, `writer` and `isrc`.

## Prerequisites
- Java 23
- Maven
- Spring Boot 3.4.4 
- Spring Web
- Spring Data JPA
- H2 Database
- Lombok
- Apache Commons Lang 3.14.0

## Getting Started
1. Clone the repository:
   ```bash
   git clone <repository-url>
   cd s02-hello-restapi
   
2. Build the project:
   ```bash
    mvn clean install
    ```
3. Run the application:
    ```bash
   mvn spring-boot:run
   ```
   
4. Access the API:
   - Open your browser and navigate to:
   - `http://localhost:8080/api/songs` for a GET request
   - Use a tool like Postman or curl to send a POST request to `http://localhost:8080/api/songs` with a JSON body:
     ```json
     {
       "title": "Imagine",
       "writer": "John Lennon",
        "isrc": "T0001435831"
     }
     ```
     
   
    