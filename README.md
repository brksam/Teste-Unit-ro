# Projeto Spring Boot - Testes Unitários e Mocking

Este projeto é um exemplo de CRUD de usuários utilizando Spring Boot, com testes unitários usando JUnit 5 e Mockito. O banco de dados utilizado para facilitar o teste é o H2 em memória.

## Tecnologias Utilizadas
- Java 11+
- Spring Boot
- Spring Web
- Spring Data JPA
- H2 Database (em memória)
- JUnit 5
- Mockito

## Como rodar o projeto

1. **Clone o repositório:**
   ```sh
   git clone https://github.com/brksam/Teste-Unit-ro.git
   cd Teste-Unit-ro
   ```
2. **Execute o projeto:**
   ```sh
   mvn spring-boot:run
   ```
   A aplicação estará disponível em: [http://localhost:8080/users](http://localhost:8080/users)

3. **Testar endpoints:**
   - **GET /users**: Lista todos os usuários
   - **POST /users**: Cria um novo usuário
     ```json
     {
       "name": "João",
       "email": "joao@email.com"
     }
     ```

4. **Acessar o console do H2:**
   - [http://localhost:8080/h2-console](http://localhost:8080/h2-console)
   - JDBC URL: `jdbc:h2:mem:testdb`
   - User: `sa` (sem senha)

## Como rodar os testes

```sh
mvn test
```

## Estrutura do Projeto
- `src/main/java/com/exemplo/model/User.java` - Entidade Usuário
- `src/main/java/com/exemplo/repository/UserRepository.java` - Repositório
- `src/main/java/com/exemplo/service/UserService.java` - Serviço
- `src/main/java/com/exemplo/controller/UserController.java` - Controlador REST
- `src/test/java/com/exemplo/service/UserServiceTest.java` - Testes unitários do serviço
- `src/test/java/com/exemplo/controller/UserControllerTest.java` - Testes unitários do controlador

## Observações
- O projeto está pronto para rodar sem necessidade de instalar banco de dados externo.
- Para usar MariaDB, basta ajustar o `application.properties` e adicionar o driver no `pom.xml`.

---

Qualquer dúvida, abra uma issue ou entre em contato! 