FórumHub

Este repositório contém a estrutura básica de um projeto Spring Boot para o desafio FórumHub.

Descrição

O FórumHub é uma API desenvolvida para gerenciar tópicos e mensagens em um fórum. Este projeto foi configurado com dependências essenciais e uma estrutura inicial para facilitar o desenvolvimento.

Tecnologias Utilizadas

Java 17: Linguagem de programação principal.

Spring Boot: Framework para desenvolvimento rápido de aplicações.

Spring Web: Para criar endpoints REST.

Spring Data JPA: Para integração com banco de dados.

PostgreSQL: Driver do banco de dados (substituível, se necessário).

Spring Security: Para autenticação e autorização.

JSON Web Tokens (JWT): Para autenticação baseada em token.

Lombok: Para reduzir o boilerplate no código.


Estrutura do Projeto

A estrutura inicial contém os seguintes pacotes:

src/main/java/com/example/forumhub/
├── controller: Controladores REST da aplicação.
├── model: Classes de modelo e entidades JPA.
├── repository: Interfaces para acesso ao banco de dados.
├── service: Lógica de negócio.
├── dto: Objetos de transferência de dados.
├── config: Configurações específicas do projeto.
├── exception: Manipulação de erros e exceções.
├── security: Configuração de autenticação e autorização.
└── util: Classes utilitárias.

Instruções para Configuração

1. Banco de Dados: Configure as credenciais do banco de dados em src/main/resources/application.properties. Exemplo:

spring.datasource.url=jdbc:postgresql://localhost:5432/forumhub
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update


2. Dependências: Certifique-se de que todas as dependências estejam instaladas corretamente. Use o Maven para gerenciar as dependências.

mvn clean install


3. Executando a Aplicação: Use o seguinte comando para iniciar o servidor:

mvn spring-boot:run



Próximos Passos

Implemente as funcionalidades do fórum (ex.: criação de tópicos, comentários, etc.).

Configure autenticação e autorização com JWT.

Escreva testes unitários e de integração.


Contribuição

Sinta-se à vontade para contribuir com melhorias ou novas funcionalidades para este projeto.

Licença

Este projeto está sob a licença MIT.


---

Desenvolvido como parte do desafio FórumHub.
