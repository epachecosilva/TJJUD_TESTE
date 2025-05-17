CREATE TABLE Autor (
    CodAu SERIAL PRIMARY KEY,
    Nome VARCHAR(40) NOT NULL
);

CREATE TABLE Assunto (
    codAs SERIAL PRIMARY KEY,
    Descricao VARCHAR(20) NOT NULL
);

CREATE TABLE Livro (
    CodI SERIAL PRIMARY KEY,
    Titulo VARCHAR(40) NOT NULL,
    Editora VARCHAR(40),
    Edicao INTEGER,
    AnoPublicacao VARCHAR(4),
    Valor DECIMAL(10,2) NOT NULL
);

CREATE TABLE Livro_Autor (
    Livro_CodI INTEGER REFERENCES Livro(CodI),
    Autor_CodAu INTEGER REFERENCES Autor(CodAu),
    PRIMARY KEY (Livro_CodI, Autor_CodAu)
);

CREATE TABLE Livro_Assunto (
    Livro_CodI INTEGER REFERENCES Livro(CodI),
    Assunto_codAs INTEGER REFERENCES Assunto(codAs),
    PRIMARY KEY (Livro_CodI, Assunto_codAs)
); 