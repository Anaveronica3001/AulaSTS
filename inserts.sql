CREATE TABLE funcionarios (
	id int not null auto_increment primary key,
    nome varchar (30) NOT NULL,
	nascimento date,
	sexo enum('M', 'F', 'Outro'),
	peso decimal(5,2),
    # exemplo: 103.50 - em cima colocar vírgula, para inserir é ponto.
    
    altura decimal(3,2),
    dia_cadastro DATETIME DEFAULT CURRENT_TIMESTAMP,
				# hora e dia, padrão, agora 
    nacionalidade varchar (20) DEFAULT 'Brasil'
    );
        
    #mostrar id no fim
    #COMANDOS DDL (DATA DEFINITION LANGUAGEM, CREATE, DROP, ELTER, RENAME)
    
    describe funcionarios;
    # tem o esqueleto da tabela 
    
    alter table funcionarios modify column nome char(255);
    
    alter table funcionarios add column historico varchar(50) after nome;
    alter table funcionarios add column historico varchar(50) first;
    alter table funcionarios drop column historico;
