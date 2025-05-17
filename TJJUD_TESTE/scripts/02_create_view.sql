CREATE OR REPLACE VIEW vw_relatorio_livros AS
SELECT 
    a.Nome AS Autor,
    l.Titulo,
    l.Editora,
    l.Edicao,
    l.AnoPublicacao,
    l.Valor,
    s.Descricao AS Assunto
FROM Livro l
JOIN Livro_Autor la ON l.CodI = la.Livro_CodI
JOIN Autor a ON la.Autor_CodAu = a.CodAu
JOIN Livro_Assunto las ON l.CodI = las.Livro_CodI
JOIN Assunto s ON las.Assunto_codAs = s.codAs
ORDER BY a.Nome, l.Titulo; 