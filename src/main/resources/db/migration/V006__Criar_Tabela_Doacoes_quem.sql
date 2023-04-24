create table doacoes_quem(
 Data date,
 idUsuario int,
 foreign key(idUsuario) references usuario(idUsuario),
 idDoacao int,
 foreign key(idDoacao) references doacoes(idDoacao)
 );