create table doacoes(
 idDoacao int not null primary key,
 comentario varchar(200),
 idUsuario int,
 foreign key(idUsuario) references usuario(idUsuario)
);