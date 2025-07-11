## 📚 Book Recommendation REST API

A simple yet unique Spring Boot RESTful API that provides **book recommendations** based on a user's favorite genres. This project demonstrates backend skills using **Spring Boot**, **Spring Data JPA**, **MySQL**, and **REST API design** principles.

---

### 🚀 Features

* 📖 Add and view books
* 👤 Register users with favorite genres
* 🎯 Get personalized book recommendations
* 🔄 RESTful API with clean endpoints
* 🗃️ MySQL (or H2) database integration
* 📑 Easy to test via Postman or Swagger

---

### 🛠️ Tech Stack

| Technology      | Usage                     |
| --------------- | ------------------------- |
| Java 17+        | Core Programming Language |
| Spring Boot     | Backend Framework         |
| Spring Data JPA | ORM for database access   |
| MySQL or H2     | Relational Database       |
| REST API        | Communication protocol    |
| Maven           | Dependency Management     |

---

### 📂 Project Structure

```
book-recommendation-api/
├── controller/
│   ├── BookController.java
│   └── UserController.java
├── model/
│   ├── Book.java
│   └── User.java
├── repository/
│   ├── BookRepository.java
│   └── UserRepository.java
├── service/
│   └── RecommendationService.java
├── BookApiApplication.java
└── resources/
    └── application.properties
```

---

### ⚙️ Setup Instructions

1. **Clone the project**

   ```bash
   git clone https://github.com/yourusername/book-recommendation-api.git
   cd book-recommendation-api
   ```

2. **Configure your database in `application.properties`**

   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/bookdb
   spring.datasource.username=root
   spring.datasource.password=yourpassword
   spring.jpa.hibernate.ddl-auto=update
   ```

   > 💡 Or switch to H2 in-memory DB for easier setup:

   ```properties
   spring.datasource.url=jdbc:h2:mem:bookdb
   spring.datasource.driverClassName=org.h2.Driver
   spring.datasource.username=sa
   spring.datasource.password=
   spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
   ```

3. **Run the application**

   ```bash
   mvn spring-boot:run
   ```

4. **Test the APIs using Postman or Swagger UI**

---

### 🔗 API Endpoints

#### 📘 Book Endpoints

| Method | Endpoint                    | Description                  |
| ------ | --------------------------- | ---------------------------- |
| GET    | `/books`                    | Get all books                |
| POST   | `/books`                    | Add a new book               |
| GET    | `/books/recommend/{userId}` | Get recommendations for user |

#### 👤 User Endpoints

| Method | Endpoint | Description     |
| ------ | -------- | --------------- |
| GET    | `/users` | Get all users   |
| POST   | `/users` | Create new user |

---

### 🧪 Sample JSON

**Add User**

```json
{
  "name": "Siddhi",
  "email": "siddhi@example.com",
  "favoriteGenres": ["Fantasy", "Mystery"]
}
```

**Add Book**

```json
{
  "title": "The Hobbit",
  "author": "J.R.R. Tolkien",
  "genre": "Fantasy"
}


