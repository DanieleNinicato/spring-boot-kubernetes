# Spring Boot Kubernetes Demo

🚀 A simple **Spring Boot** application with a REST controller, built with **Maven**, containerized with **Docker**, and automated using **GitHub Actions** for versioning and deployment.

## 📌 Features

- **Simple REST API** with `GET` and `POST` endpoints.
- **Spring Boot Actuator** enabled (`/actuator` for health checks).
- **Dockerized build** using `spring-boot-maven-plugin`.
- **Automated CI/CD** via GitHub Actions:
  - Version bumping based on commit messages (`#major`, `#minor`, `#patch`).
  - Automatic Docker image build & push to Docker Hub.

---

## 🚀 Getting Started

### **1️⃣ Clone the Repository**
```sh
git clone https://github.com/DanieleNinicato/spring-boot-kubernetes.git
cd spring-boot-kubernetes
```

### **2️⃣ Build & Run Locally**
Using Maven
```sh
mvn clean package
java -jar target/spring-boot-kubernetes-<VERSION>.jar
```

## 🐳 Running with Docker
### 1️⃣ Build Image
```sh
mvn spring-boot:build-image
```

### 2️⃣ Run Container
```sh
docker run -p 8081:8081 -e MY_ENV_VAR="CustomEnvValue" danieleninicato/spring-boot-kubernetes:<VERSION>
```

## ⚡ CI/CD Workflow
### This project is automated using GitHub Actions:

Push to master → Triggers the CI/CD workflow.
Version bump based on commit message:
- **#major** → Increases major version (e.g., 1.0.0 → 2.0.0).
- **#minor** → Increases minor version (e.g., 1.0.0 → 1.1.0).
- **#patch** → Increases patch version (e.g., 1.0.0 → 1.0.1).
  
Docker Image Built & Pushed:
Image is built and tagged as danieleninicato/spring-boot-kubernetes:<VERSION>.
Pushed to Docker Hub.
