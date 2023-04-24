create table descarte(
 idDescarte int not null primary key,
 qtde int,
 idUsuario int,
 foreign key(idUsuario) references usuario(idUsuario)
 );