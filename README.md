
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

- **Java 17+**
- **Spring Boot**
- **Spring Data JPA**
- **PostgreSQL**
- **Maven**
- **Hibernate**

---

## 📦 Project Structure

```

src/
├── controllers
├── services
├── mappers
├── domain
│   ├── dto
│   └── entities
└── repositories

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

## 🧪 Running Locally

# Clone the repo
git clone https://github.com/<your-username>/task-tracker.git

# Navigate into project
cd task-tracker

# Run the app
./mvnw spring-boot:run
````

Make sure PostgreSQL is running and configured in `application.properties`.

---

## 🔒 License

This project is open-source and available under the [MIT License](LICENSE).

---

````

