# Spring Boot Backend API
## Java Spring Boot + MongoDB REST API

This repository contains the backend REST API built with Spring Boot and MongoDB for the full-stack mini project.

### Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Data MongoDB
- Spring Web
- Maven
- JUnit & Mockito for testing
- Swagger/OpenAPI for API documentation

### Prerequisites

- JDK 17 or higher
- MongoDB
- Maven
- IDE (IntelliJ IDEA recommended)

### Project Structure

```
spring-boot-backend/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com/project/
│   │   │   │   ├── config/
│   │   │   │   ├── controller/
│   │   │   │   ├── model/
│   │   │   │   ├── repository/
│   │   │   │   ├── service/
│   │   │   │   ├── exception/
│   │   │   │   └── Application.java
│   │   └── resources/
│   │       └── application.properties
│   └── test/
│       └── java/
├── pom.xml
└── README.md
```

### Getting Started

1. Clone the repository:
   ```bash
   git clone https://github.com/yourusername/spring-boot-backend.git
   cd spring-boot-backend
   ```

2. Configure MongoDB connection in `src/main/resources/application.properties`:
   ```properties
   spring.data.mongodb.uri=mongodb://localhost:27017/mydatabase
   spring.data.mongodb.database=mydatabase
   ```

3. Install dependencies:
   ```bash
   mvn install
   ```

4. Run the application:
   ```bash
   mvn spring-boot:run
   ```
   The server will start on `http://localhost:8080`

### API Endpoints

#### Resource Endpoints
- `GET /api/v1/movies` - Get all resources
- `POST /api/v1/reviews` - Create a new resource
- `GET /api/v1/movie/{id}` - Get a specific resource

### Configuration

#### CORS Configuration
CORS is enabled for the React frontend. Update the CORS configuration in `WebConfig.java`:
```java
@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")
                .allowedOrigins("http://localhost:3000")
                .allowedMethods("GET", "POST", "PUT", "DELETE")
                .allowedHeaders("*");
    }
}
```

### Testing

Run tests using Maven:
```bash
mvn test
```

### API Documentation

The API documentation is available through Swagger UI when the application is running:
- Swagger UI: `http://localhost:8080/swagger-ui.html`
- OpenAPI JSON: `http://localhost:8080/v3/api-docs`

### Error Handling

The API uses standard HTTP status codes:
- 200: Success
- 201: Created
- 400: Bad Request
- 404: Not Found
- 500: Internal Server Error

### Development

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/AmazingFeature`)
3. Commit your changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request

### Environment Variables

Create a `.env` file in the root directory:
```
MONGODB_URI=your_mongodb_uri
SERVER_PORT=8080
```

### Deployment

1. Build the JAR file:
   ```bash
   mvn clean package
   ```

2. Run the JAR file:
   ```bash
   java -jar target/spring-boot-backend-1.0.0.jar
   ```

### License
This project is licensed under the MIT License.
