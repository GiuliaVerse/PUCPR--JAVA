
-- Tabela Usuario
CREATE TABLE Usuario (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    senha VARCHAR(100) NOT NULL
);

-- Tabela ListaTarefa
CREATE TABLE ListaTarefa (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    descricao TEXT,
    dataCriacao DATE,
    usuario_id BIGINT,
    FOREIGN KEY (usuario_id) REFERENCES Usuario(id)
);

-- Tabela Categoria
CREATE TABLE Categoria (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(100) NOT NULL,
    cor VARCHAR(20)
);

-- Tabela Tarefa
CREATE TABLE Tarefa (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    descricao TEXT NOT NULL,
    concluida BOOLEAN DEFAULT FALSE,
    dataLimite DATE,
    prioridade VARCHAR(20),
    lista_tarefa_id BIGINT,
    categoria_id BIGINT,
    FOREIGN KEY (lista_tarefa_id) REFERENCES ListaTarefa(id),
    FOREIGN KEY (categoria_id) REFERENCES Categoria(id)
);

-- Tabela Comentario
CREATE TABLE Comentario (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    texto TEXT NOT NULL,
    data DATETIME,
    tarefa_id BIGINT,
    FOREIGN KEY (tarefa_id) REFERENCES Tarefa(id)
);

-- Tabela Etiqueta
CREATE TABLE Etiqueta (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    nome VARCHAR(50) NOT NULL,
    cor VARCHAR(20)
);

-- Tabela associativa Tarefa_Etiqueta (N:N)
CREATE TABLE Tarefa_Etiqueta (
    tarefa_id BIGINT,
    etiqueta_id BIGINT,
    PRIMARY KEY (tarefa_id, etiqueta_id),
    FOREIGN KEY (tarefa_id) REFERENCES Tarefa(id),
    FOREIGN KEY (etiqueta_id) REFERENCES Etiqueta(id)
);

-- Tabela Notificacao
CREATE TABLE Notificacao (
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    mensagem TEXT NOT NULL,
    dataEnvio DATETIME,
    foiEnviada BOOLEAN DEFAULT FALSE,
    tarefa_id BIGINT,
    FOREIGN KEY (tarefa_id) REFERENCES Tarefa(id)
);
