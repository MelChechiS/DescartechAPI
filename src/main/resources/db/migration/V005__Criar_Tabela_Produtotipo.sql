 create table produtotipo(
 idProduto int not null primary key,
 nomeproduto varchar(40),
 valor int,
 idDescarte int,
 foreign key(idDescarte) references descarte(idDescarte)
);
