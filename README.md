# 🎧 Podcast API

A RESTful backend service for managing and serving a catalog of podcasts, built with Scala and Play Framework. This project showcases a scalable API architecture with PostgreSQL integration using Slick.

---

## 🚀 Features

- List all podcasts
- Retrieve podcast details by ID
- Search podcasts by category
- Add new podcasts via POST
- Built with Scala, Play Framework, and PostgreSQL
- Slick used for functional database access

---

## 🛠️ Tech Stack

| Tool            | Role                             |
|-----------------|----------------------------------|
| Scala           | Programming language             |
| Play Framework  | Web framework                    |
| PostgreSQL      | Relational database              |
| Slick           | Database ORM                     |
| sbt             | Build tool                       |
| Docker (optional)| Deployment containerization     |

---

## 📦 Requirements

- JDK 17
- sbt (Scala Build Tool)
- PostgreSQL
- Git
- Play Framework
- Slick

---

## 🧪 Running

To run this RESTful API Service, execute the following command in the projects directory

- sbt run

Once entered, navigate to https//:localhost:9000/podcasts, here you will see a JSON repsonse

## 📚 API Endpoints

| Method | Endpoint       | Description               |
| ------ | -------------- | ------------------------- |
| GET    | /podcasts      | List all podcasts         |
| GET    | /podcasts/\:id | Get podcast by ID         |
| POST   | /podcasts      | Create a new podcast      |
| GET    | /              | Home page (optional HTML) |

## 🧰 Development Notes

- Slick models are in models/PodcastTable.scala
- Repositories use dependency injection
-  Routes defined in conf/routes





