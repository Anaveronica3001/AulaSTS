create database db_fiat;
use db_fiat;

/*drop table funcionarios;*/
CREATE table funcionarios (
		id int not null auto_increment,
		nome varchar(30) NOT NULL,
		nascimento date,
		sexo enum ('M','F'),
		peso decimal(5,2),
		altura decimal(3,2),
		nacionalidade varchar(20) DEFAULT 'Brasil',
		primary key (id)
        )engine=innodb;
        #MyIsan
        #History
