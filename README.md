
```markdown
# 📝 Task Tracker

A simple task tracking API built with Spring Boot and PostgreSQL. This backend application supports creating and managing task lists and tasks with full CRUD operations.

---

## 🚀 Features

- Create task lists
- Add tasks to task lists
- Update task details and status
- Delete tasks and lists
- API-ready for frontend integration (e.g., React)

---

## 🛠️ Tech Stack

- **Backend:** Java, Spring Boot, Spring Data JPA, Hibernate
- **Database:** PostgreSQL
- **Mapping:** DTOs with Mapper classes
- **Version Control:** Git & GitHub
- **Testing:** Postman / any REST client

---

## 📦 Project Structure
src/
│
├── controllers # REST API controllers
├── domain
│ ├── dto # Data Transfer Objects
│ └── entities # JPA entities
├── mappers # Mapper classes for DTO <-> entity conversion
└── services # Business logic services

```


````

---

## 📮 API Endpoints

| Method | Endpoint | Description |
|--------|----------|-------------|
| GET | `/api/task-lists` | List all task lists |
| POST | `/api/task-lists` | Create a new task list |
| PUT | `/api/task-lists/{id}` | Edit/Update task list |
| DELETE | `/api/task-lists/{id}` | Delete task list |
| GET | `/api/task-lists/{id}/tasks` | List tasks in a list |
| POST | `/api/task-lists/{id}/tasks` | Add task to list |
| PUT | `/api/tasks/{id}` | Update a task |
| DELETE | `/api/tasks/{id}` | Delete a task |

---

⚡ Getting Started
Prerequisites

- Java 17+

- Maven

- PostgreSQL

Setup

1. Clone the repository:

git clone https://github.com/dev-tanakarh/task-tracker.git
cd task-tracker


2. Configure your PostgreSQL database in application.properties or application.yml

3. Build and run the application:

mvn clean install
mvn spring-boot:run


4. Access the API at http://localhost:8080

🤝 Contributing

Pull requests are welcome. Ensure your changes are well-tested and documented.
````


---

## 🔒 License

This project is open-source and available under the [MIT License](LICENSE).

---

````

