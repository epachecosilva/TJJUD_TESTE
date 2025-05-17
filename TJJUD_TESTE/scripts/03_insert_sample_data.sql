INSERT INTO Autor (Nome) VALUES ('Machado de Assis'), ('Clarice Lispector');
INSERT INTO Assunto (Descricao) VALUES ('Romance'), ('Conto');
INSERT INTO Livro (Titulo, Editora, Edicao, AnoPublicacao, Valor) VALUES
('Dom Casmurro', 'Editora A', 1, '1899', 39.90),
('A Hora da Estrela', 'Editora B', 2, '1977', 29.90);

INSERT INTO Livro_Autor (Livro_CodI, Autor_CodAu) VALUES (1, 1), (2, 2);
INSERT INTO Livro_Assunto (Livro_CodI, Assunto_codAs) VALUES (1, 1), (2, 2); 