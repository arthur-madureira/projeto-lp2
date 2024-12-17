# Places API

## Descrição

A Places API é uma aplicação Spring Boot que permite gerenciar lugares (places) com informações de endereço e localização. A API permite criar, listar, buscar e deletar lugares.

## Endpoints

### Listar todos os lugares

**GET** `/places`

**Resposta:**
```json
[
  {
    "_id": "6761ffb16803243ce306b967",
    "name": "Central Park",
    "address": {
      "street": "59th St to 110th St",
      "city": "New York",
      "state": "NY",
      "zip": "10022",
      "location": {
        "lat": 40.785091,
        "lng": -73.968285
      }
    },
  },
  {
  "_id": "67620093851168587164a86c",
  "name": "Eiffel Tower",
  "address": {
    "street": "Champ de Mars, 5 Avenue Anatole France",
    "city": "Paris",
    "state": "Île-de-France",
    "zip": "75007",
    "location": {
      "lat": 48.858844,
      "lng": 2.294351
    }
  }
}
]
```

### Buscar lugar por ID

**GET** `/places/{id}`

**Resposta:**
```json
{
  "_id": "6761ffb16803243ce306b967",
  "name": "Central Park",
  "address": {
    "street": "59th St to 110th St",
    "city": "New York",
    "state": "NY",
    "zip": "10022",
    "location": {
      "lat": 40.785091,
      "lng": -73.968285
    }
  },
}
```

### Criar um novo lugar

**POST** `/places`

**Corpo da Requisição:**
```json
{
  "name": "Central Park",
  "address": {
    "street": "59th St to 110th St",
    "city": "New York",
    "state": "NY",
    "zip": "10022",
    "location": {
      "lat": 40.785091,
      "lng": -73.968285
    }
  },
}
```

**Resposta:**
```json
{
  "_id": "6761ffb16803243ce306b967",
  "name": "Central Park",
  "address": {
    "street": "59th St to 110th St",
    "city": "New York",
    "state": "NY",
    "zip": "10022",
    "location": {
      "lat": 40.785091,
      "lng": -73.968285
    }
  },
}
```

### Deletar um lugar

**DELETE** `/places/{id}`

**Resposta:**
- **204 No Content**: Se o lugar foi deletado com sucesso.
- **404 Not Found**: Se o lugar não foi encontrado.

## Configuração

### application.properties

```properties
spring.application.name=places
server.port=8081
spring.data.mongodb.uri=<uri_de_conexão>
spring.data.mongodb.database=<nome_database>
```

Substitua `<username>` e `<password>` pelas suas credenciais do MongoDB.

## Executando a Aplicação

Para executar a aplicação, use o seguinte comando:

```bash
mvn spring-boot:run
```

## Dependências

- Spring Boot
- Spring Data MongoDB
- Lombok
- Jakarta Validation

## Estrutura do Projeto

- `controller`: Contém os controladores REST.
- `model`: Contém as classes de modelo.
- `repository`: Contém as interfaces de repositório.