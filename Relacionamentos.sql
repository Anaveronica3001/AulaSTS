create database dbaulachaves1;
use dbaulachaves1;

CREATE TABLE tb1_pessoa (
idPessoa integer PRIMARY KEY AUTO_INCREMENT,
nome varchar(255));

CREATE TABLE tb2_carro(

idCarro varchar (255),
marcra varchar (255),
idPessoa integer,
FOREIGN KEY (idPessoa) REFERENCES tb1_pessoa(idPessoa));

insert into tb1_pessoa (nome) values
('Juliana'),
('Julio'),
('Marcio');
SELECT*FROM tb_pessoa;

insert into tb2_carro (nome_carro, marca, idPessoa)values
('Gol','Works',2),
('Palio','Fiat',3);


#describe tb2_carro;

select*from tb2_carro
inner join tb1_pessoa
where tb1_pessoa.idPessoa = tb2_carro.idPessoa;

truncate tb2_carro;
truncate tb1_pessoa;






