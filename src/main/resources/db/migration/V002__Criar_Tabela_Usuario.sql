create table usuario(
 idUsuario int not null primary key,
 nomeusuario varchar(60),
 pontuacao int,
 CPF varchar(16),
 email varchar(40),
 telefone varchar(12),
 senha varchar(40),
 endereco varchar(30),
 numeroendereco int,
 idCidade int,
 foreign key(idCidade) references cidade(idCidade)
);