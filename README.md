# 🌟 Spring Auth JWT 🌟

Welcome to the **Spring Auth JWT** project! This is a demo project for implementing JWT-based authentication using Spring Boot.

## 📋 Table of Contents

- [Introduction](#-introduction)
- [Features](#-features)
- [Getting Started](#-getting-started)
- [Usage](#-usage)
- [Contributing](#-contributing)

## 📖 Introduction

This project demonstrates how to secure a Spring Boot application using JSON Web Tokens (JWT). It includes basic setup for authentication and authorization.

## ✨ Features

- JWT Authentication and Authorization
- Secure REST APIs
- User management with encrypted passwords
- Example endpoints for testing

## 🚀 Getting Started

### Prerequisites

- Java 23 or higher
- Maven 3.6.5 or higher

### Installation

1. Clone the repository:

  ```sh
  git clone https://github.com/Josepch1/spring-auth-jwt.git
  ```

2. Navigate to the project directory:

  ```sh
  cd spring-auth-jwt
  ```

3. Ensure you have `app.key` and `app.pub` files in the `resources` directory. To generate these files, use the following commands:

  ```sh
  openssl genpkey -algorithm RSA -out app.key -pkeyopt rsa_keygen_bits:2048
  openssl rsa -in app.key -pubout -out app.pub
  ```

4. Build the project:

  ```sh
  ./mvnw clean package
  ```

5. Run the application:

  ```sh
  java -jar target/spring-auth-jwt-0.0.1-SNAPSHOT.jar
  ```

## 📚 Usage

### Endpoints

- **Public Endpoint**: `POST /authenticate` to get the JWT token
- **Private Endpoint**: `GET /private` (requires JWT token in Bearer)

Happy coding! 💻✨