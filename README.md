# ✈️ Sistema de Cadastro de Aeronaves (Backend)

## 📌 Descrição

Este projeto é um backend desenvolvido em **Java com Spring Boot** para gerenciar o cadastro de aeronaves. Ele fornece uma API REST que permite realizar operações de **CRUD (Create, Read, Update, Delete)** sobre os dados das aeronaves.

O sistema foi estruturado seguindo boas práticas de organização em camadas, facilitando manutenção, escalabilidade e integração com frontend (como React).

---

## 🚀 Funcionalidades

* ✅ Cadastrar aeronave
* ✅ Listar todas as aeronaves
* ✅ Buscar aeronave por ID
* ✅ Atualizar aeronave
* ✅ Deletar aeronave

---

## 📦 Exemplo de Objeto (JSON)

```json
{
  "id": 1,
  "name": "Boeing 737",
  "model": "737-800",
  "manufacturer": "Boeing",
  "year": 2015
}
```

---

## 🔗 Endpoints da API

### 📍 Criar aeronave

```
POST /aircraft
```

### 📍 Listar todas

```
GET /aircraft
```

### 📍 Buscar por ID

```
GET /aircraft/{id}
```

### 📍 Atualizar

```
PUT /aircraft/{id}
```

### 📍 Deletar

```
DELETE /aircraft/{id}
```

---

## 🛠️ Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Web
* Spring Data JPA
* Banco de dados (ex: PostgreSQL / H2 / Supabase)
* Maven

---

## 🔌 Integração com Frontend

O frontend (ex: React) se conecta ao backend através de requisições HTTP.

Exemplo usando `fetch`:

```javascript
fetch("http://localhost:8080/aircraft")
  .then(response => response.json())
  .then(data => console.log(data));
```

---

## ▶️ Como Executar o Projeto

1. Clone o repositório:

```bash
git clone <url-do-repositorio>
```

2. Acesse a pasta:

```bash
cd nome-do-projeto
```

3. Execute o projeto:

```bash
./mvnw spring-boot:run
```

ou pela IDE (IntelliJ / Eclipse)

---

## 📄 Observações

* Certifique-se de configurar corretamente o banco de dados no `application.properties`.
* O projeto pode ser expandido com autenticação, validações e documentação (Swagger).

---

## 👨‍💻 Autor

Projeto desenvolvido para fins de estudo e prática de desenvolvimento backend com Java.

---
