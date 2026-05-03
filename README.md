# ✈️ API de Cadastro de Aeronaves

API REST desenvolvida com **Spring Boot** para gerenciamento de aeronaves, oferecendo operações completas de **CRUD (Create, Read, Update, Delete)**.

---

## 🚀 Funcionalidades

* ✅ Criar aeronave
* ✅ Listar todas as aeronaves
* ✅ Buscar aeronave por ID
* ✅ Atualizar dados
* ✅ Deletar aeronave

---

## 🛠️ Tecnologias Utilizadas

* Java 21
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Maven

---

## 📂 Estrutura do Projeto

```id="struct1"
src/main/java/com/seuprojeto
 ├── controller     # Controladores REST
 ├── service        # Regras de negócio
 ├── repository     # Acesso ao banco (JPA)
 └── model          # Entidades (Aeronave)
```

---

## 🔗 Endpoints da API

| Método | Endpoint        | Descrição     |
| ------ | --------------- | ------------- |
| GET    | /aeronaves      | Listar todas  |
| GET    | /aeronaves/{id} | Buscar por ID |
| POST   | /aeronaves      | Criar         |
| PUT    | /aeronaves/{id} | Atualizar     |
| DELETE | /aeronaves/{id} | Deletar       |

---

## 📌 Exemplo de JSON

### 🔹 Criar/Atualizar Aeronave

```json id="json1"
{
  "name": "Boeing 737",
  "model": "737-800",
  "manufacturer": "Boeing",
  "year": 2015
}
```
## 🌐 Acesso à API

```id="url1"
http://localhost:8080/aeronaves
```

---

## 🧪 Testando a API

Você pode usar:

* Postman
* Insomnia
* Thunder Client (VS Code)

---

## 🧠 Conceitos Aplicados

* Arquitetura em camadas (Controller, Service, Repository)
* REST API
* Persistência com JPA/Hibernate
* Integração com banco de dados relacional

---

## ⚠️ Tratamento de Erros (melhoria futura)

Sugestões para evolução:

* Validação com `@Valid`
* Exceptions customizadas
* Retornos padronizados (DTOs)

---

## 📌 Melhorias Futuras

* 🔐 Autenticação com JWT
* 📄 Paginação e filtros
* 📊 Logs e monitoramento
* 🌐 Deploy em cloud (AWS / Render)

---

## 👨‍💻 Autor

Desenvolvido por Enzo Borges

