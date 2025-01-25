# Spring Boot Clean Architecture

Este projeto demonstra a migração de uma arquitetura em camadas para Clean Architecture utilizando Spring Boot. Ele inclui uma estrutura modular com camadas claramente separadas e testes para cada uma.

## Estrutura do Projeto

- **Domain**: Contém as entidades e casos de uso do negócio.
- **Application**: Contém os gateways (interfaces) e implementações de casos de uso.
- **Infrastructure**: Contém a persistência, mapeadores de entidades e controladores da web.
- **Main**: Contém a configuração de beans do Spring.

## Requisitos

- Java 11 ou superior
- Maven 3.6.0 ou superior
- Docker (opcional, para rodar banco de dados em container)

## Configuração

1. Clone o repositório:

```sh
git clone https://github.com/ShinigameBR/projeto-final-BPP.git
cd projeto-final-BPP
```

2. Configure as variáveis de ambiente no arquivo `application.properties`:

```properties
spring.h2.console.enabled=true
spring.datasource.url=jdbc:h2:file:./data/db
spring.datasource.username=sa
spring.datasource.password=
spring.sql.init.mode=always
```

## Execução

1. Compile e rode o projeto usando Maven:

```sh
mvn clean install
mvn spring-boot:run
```

2. A API estará disponível em `http://localhost:8080`.

## Endpoints

- `POST /users`: Cria um novo usuário.
  - **Request Body**:
    ```json
    {
      "username": "string",
      "password": "string",
      "email": "string"
    }
    ```
  - **Response**:
    ```json
    {
      "username": "string",
      "email": "string"
    }
    ```

## Scripts de Build e Teste

### Build

Para compilar o projeto, execute:

```sh
mvn clean install
```

### Testes

Para rodar os testes unitários e de integração, execute:

```sh
mvn test
```

## Contribuição

1. Fork o repositório
2. Crie um branch para a sua feature (`git checkout -b feature/nova-feature`)
3. Commit suas mudanças (`git commit -m 'Adiciona nova feature'`)
4. Suba seu branch (`git push origin feature/nova-feature`)
5. Abra um Pull Request

---

Espero que isso ajude! Se precisar de mais alguma coisa, estarei por aqui. 🚀😊