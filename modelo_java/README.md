
# Projeto de Gerenciamento de Tarefas

## Descrição

Este projeto consiste em um sistema de gerenciamento de tarefas desenvolvido em Java utilizando o padrão JPA (Java Persistence API) com a implementação EclipseLink. Ele permite o cadastro, organização e controle de tarefas por meio de categorias, listas, etiquetas e comentários. O sistema também suporta notificações para os usuários.

## Objetivo

O objetivo principal do projeto é demonstrar a aplicação prática de conceitos de mapeamento objeto-relacional (ORM) utilizando o JPA com EclipseLink, além da implementação de um CRUD completo para cada entidade modelada no diagrama de classes.

## Tecnologias Utilizadas

- Java 11+
- JPA (Java Persistence API)
- EclipseLink (implementação JPA)
- Maven (gerenciamento de dependências)
- Banco de dados relacional (ex: MySQL, PostgreSQL ou H2)
- IDE recomendada: Eclipse ou IntelliJ IDEA

## Estrutura do Projeto

O sistema é composto por 7 classes principais, representando as entidades do domínio:

### 1. `Usuario`
- Representa o usuário do sistema.
- Atributos: `id`, `nome`, `email`, `senha`.
- Relacionamentos: autor de tarefas e comentários, receptor de notificações.

### 2. `Tarefa`
- Representa uma tarefa registrada pelo usuário.
- Atributos: `id`, `titulo`, `descricao`, `dataCriacao`, `dataConclusao`, `concluida`.
- Relacionamentos: autor, categoria, lista de tarefas, etiquetas, comentários.

### 3. `Categoria`
- Representa uma categoria atribuída à tarefa.
- Atributos: `id`, `nome`, `cor`.

### 4. `ListaTarefa`
- Representa uma lista que organiza múltiplas tarefas.
- Atributos: `id`, `titulo`.

### 5. `Etiqueta`
- Representa uma etiqueta que pode ser associada a uma ou mais tarefas.
- Atributos: `id`, `nome`, `cor`.

### 6. `Comentario`
- Comentários feitos pelos usuários em tarefas.
- Atributos: `id`, `texto`, `data`.
- Relacionamentos: autor (usuário), tarefa associada.

### 7. `Notificacao`
- Representa uma notificação enviada para um usuário.
- Atributos: `id`, `mensagem`, `lida`.

## Funcionalidades

- Criar, listar, atualizar e remover:
  - Usuários
  - Tarefas
  - Categorias
  - Listas de tarefas
  - Etiquetas
  - Comentários
  - Notificações
- Atribuir categorias e etiquetas às tarefas
- Relacionar tarefas a listas
- Enviar e marcar notificações como lidas
- Adicionar comentários às tarefas


## Requisitos

- JDK 11 ou superior
- Maven instalado
- Banco de dados configurado
- Dependências do EclipseLink corretamente resolvidas via Maven

## Estrutura do Banco de Dados

O modelo segue o diagrama abaixo:

`META-INF\Diagrama.jpg` 

## Conclusão

Este projeto demonstra os fundamentos de desenvolvimento orientado a objetos, persistência com JPA, e organização de um sistema básico de tarefas com entidades bem definidas e relacionamentos consistentes.
