create database db_servico_rh;

use db_servico_rh;

create table tb_funcionarios(
id bigint auto_increment, 
nome varchar (255) not null, 
idade int not null, 
primary key (id),
colaborador_id bigint,
foreign key (colaborador_id) references tb_cargos(id)
);

create table tb_cargos(
id bigint auto_increment, 
cargo varchar(255) not null, 
salario decimal not null, 
primary key (id)

);

select * from tb_funcionarios;

select * from tb_cargos;

insert into tb_cargos (cargo,salario) values ("Dev", 6000);
insert into tb_cargos (cargo, salario) values ("Prof", 15000);

insert into tb_funcionarios (nome, idade, colaborador_id) values ("Lucas", 24, 1);
insert into tb_funcionarios (nome, idade, colaborador_id) values ("Tiago", 22, 1);
insert into tb_funcionarios (nome, idade, colaborador_id) values ("Geandro", 42, 1);
insert into tb_funcionarios (nome, idade, colaborador_id) values ("Aimee", 17,2);
insert into tb_funcionarios (nome, idade, colaborador_id) values ("Gabriela", 27,2);
insert into tb_funcionarios (nome, idade, colaborador_id) values ("T", 42, 1);

select * from tb_funcionarios INNER JOIN tb_cargos on tb_cargos.id = tb_funcionarios.colaborador_id;

select * from tb_funcionarios left join tb_cargos on tb_cargos.id = tb_funcionarios.colaborador_id; 

select * from tb_funcionarios right join tb_cargos on tb_cargos.id = tb_funcionarios.colaborador_id; /* tra
