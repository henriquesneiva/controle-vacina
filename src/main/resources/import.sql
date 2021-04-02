insert into vacina (nome) values ('coronavac')
insert into vacina (nome) values ('butantan')

insert into usuario (cpf,data_nacimento,email,nome) values ('12345678','2000-02-02','henrique@teste','henrique')
insert into usuario (cpf,data_nacimento,email,nome) values ('12345675','2002-05-02','joao@teste','joao')
insert into usuario (cpf,data_nacimento,email,nome) values ('12345670','2010-07-02','pedro@teste','pedro')


insert into usuario_vacina (usuario_id,vacina_id,data_aplicacao) values (1,1,'2021-07-13')
insert into usuario_vacina (usuario_id,vacina_id,data_aplicacao) values (2,2,'2021-07-14')
insert into usuario_vacina (usuario_id,vacina_id,data_aplicacao) values (3,1,'2021-07-12')
insert into usuario_vacina (usuario_id,vacina_id,data_aplicacao) values (3,2,'2021-07-12')