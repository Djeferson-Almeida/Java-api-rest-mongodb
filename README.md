## 🧩 Sobre o Projeto

### Este projeto consiste em uma **API RESTful** desenvolvida com **Spring Boot** e **MongoDB**, que simula funcionalidades básicas de uma rede social. Através dela, é possível:
* 📌 **Cadastrar usuários**
*  📝 **Criar postagens associadas a esses usuários**

### A aplicação oferece endpoints para operações de **CRUD** (criar, ler, atualizar e deletar) de usuários e para a **publicação e consulta de posts**, permitindo testes e estudos  com relacionamento de documentos no MongoDB.

## 📡 API Endpoints

  ### Users

* 🔍 `GET /users` — Buscar todos os usuários  
* 🔍 `GET /users/{id}` — Buscar usuário por ID
* 📨 `GET /users/{id}/posts` — Listar posts de um usuário 
* 📝 `POST /users` — Criar um novo usuário  
* 🔄 `PUT /users/{id}` — Atualizar um usuário  
* ❌ `DELETE /users/{id}` — Deletar um usuário

  ### Posts
* 🔍 `GET /posts/{id}` — Buscar post por ID  
* 🔍 `GET /posts/titlesearch` — Buscar post por título  
* 🔍 `GET /posts/fullsearch` — Busca todos os posts

## 🚀 Tecnologias utilizadas

* Java 17
* Spring Boot
* Spring Data MongoDB
* MongoDB
* Maven

## ▶️ Como executar o projeto

### Pré-requisitos

* Java JDK 17+
* MongoDB em execução local (porta padrão 27017) ou conexão externa
* Maven

### Passos para rodar localmente

## Clone o repositório
git clone https://github.com/Djeferson-Almeida/Java-api-rest-mongodb

## Configure o application.properties ou application.yml conforme abaixo:
### spring.data.mongodb.uri=mongodb://localhost:27017/springmongo
## Se precisar mudar a porta de inicialização da sua aplicação, edite o arquivo application.properties ou application.yml e adicione (ou altere) a seguinte linha:
### server.port=${port:8080} a porta pode ser a que você preferir
