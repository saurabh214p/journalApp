# 📖 Journal App

A secure and scalable **Spring Boot REST API** for managing personal journal entries. The application provides user authentication, role-based authorization, CRUD operations for journal entries, weather integration, sentiment analysis, Redis caching, scheduled tasks, email notifications, and Docker support.

---

## 🚀 Features

* 🔐 JWT-based Authentication & Authorization
* 👤 User Registration and Login
* 📝 Create, Read, Update, and Delete Journal Entries
* 🔒 Secure APIs using Spring Security
* 🌦️ Weather Information Integration
* 😊 Sentiment Analysis for Journal Entries
* ⚡ Redis Caching for Improved Performance
* 📧 Email Notification Support
* ⏰ Scheduled Background Jobs
* 🐳 Docker Support
* ✅ GitHub Actions CI Pipeline
* 📊 RESTful API Design

---

## 🛠️ Tech Stack

### Backend

* Java 8
* Spring Boot
* Spring Security
* Spring Data MongoDB
* Maven

### Database

* MongoDB

### Cache

* Redis

### DevOps

* Docker
* GitHub Actions

### Other Integrations

* Email Service
* Weather API
* Sentiment Analysis API

---

## 📂 Project Structure

```text
src
├── config
├── controller
├── entity
├── repository
├── service
├── scheduler
├── cache
├── api
└── exception
```

---

## ⚙️ Prerequisites

* Java 8+
* Maven
* MongoDB
* Redis
* Docker (Optional)

---

## 🚀 Installation

### Clone Repository

```bash
git clone https://github.com/<your-username>/journalApp.git
cd journalApp
```

### Configure Environment

Update the following properties in `application.properties`:

```properties
spring.data.mongodb.uri=YOUR_MONGODB_URI
spring.data.mongodb.database=journaldb

spring.redis.host=localhost
spring.redis.port=6379

jwt.secret=YOUR_SECRET_KEY
```

### Build the Project

```bash
mvn clean install
```

### Run the Application

```bash
mvn spring-boot:run
```

The application will start at:

```
http://localhost:8080
```

---

## 🐳 Running with Docker

Build the Docker image:

```bash
docker build -t journal-app .
```

Run the container:

```bash
docker run -p 8080:8080 journal-app
```

---

## 📌 Main Modules

### Authentication

* User Registration
* Login
* JWT Authentication
* Role-Based Authorization

### Journal Management

* Create Journal Entry
* View Journal Entries
* Update Journal Entry
* Delete Journal Entry

### Weather Integration

* Fetch current weather information

### Sentiment Analysis

* Analyze the sentiment of journal entries

### Redis Cache

* Cache frequently accessed data for faster response times

### Scheduler

* Background scheduled tasks

### Email Service

* Send automated email notifications

---

## 🧪 Testing

Run all tests:

```bash
mvn test
```

---

## 📈 Future Improvements

* OAuth2 Login
* Swagger/OpenAPI Documentation
* Elasticsearch Integration
* Pagination & Filtering
* File Attachments
* Mobile Application Support
* Kubernetes Deployment

---

## 🤝 Contributing

Contributions are welcome.

1. Fork the repository
2. Create a new feature branch

```bash
git checkout -b feature/new-feature
```

3. Commit your changes

```bash
git commit -m "Add new feature"
```

4. Push to your branch

```bash
git push origin feature/new-feature
```

5. Open a Pull Request

---

## 📄 License

This project is licensed under the MIT License.

---

## 👨‍💻 Author

**Saurabh Pandey**

Backend Developer | Java | Spring Boot | MongoDB | Redis | Docker

GitHub: https://github.com/saurabh214p

---

⭐ If you found this project useful, consider giving it a star!
