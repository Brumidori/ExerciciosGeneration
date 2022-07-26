create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categorias(
id BIGINT auto_increment,
tipo varchar (255),
borda varchar(255),
primary key (id)
);

create table tb_pizzas(
id BIGINT auto_increment,
sabor varchar (255) not null, 
preco double not null, 
tamanho varchar (255) not null,
meia boolean,
primary key (id),
categoria_id bigint,
foreign key (categoria_id) references tb_categorias(id)
);

INSERT INTO tb_categorias (tipo, borda) values ("doce", "recheada");
INSERT INTO tb_categorias (tipo, borda) values ("doce","sem recheio");
INSERT INTO tb_categorias (tipo, borda) values ("salgada","sem recheio");
INSERT INTO tb_categorias (tipo, borda) values ("salgada","recheada");

INSERT INTO tb_pizzas (sabor, preco, tamanho, meia, categoria_id) values ("mussarela", 50, "grande", false, 3);
INSERT INTO tb_pizzas (sabor, preco, tamanho, meia, categoria_id) values ("banana", 24.90, "grande", true, 2);
INSERT INTO tb_pizzas (sabor, preco, tamanho, meia, categoria_id) values ("banana com canela", 24.90, "grande", true, 2);
INSERT INTO tb_pizzas (sabor, preco, tamanho, meia, categoria_id) values ("atum", 80.90, "grande", false, 4);
INSERT INTO tb_pizzas (sabor, preco, tamanho, meia, categoria_id) values ("brigadeiro", 35.80, "grande", true, 1);
INSERT INTO tb_pizzas (sabor, preco, tamanho, meia, categoria_id) values ("marguerita", 22.90, "broto", false, 3);
INSERT INTO tb_pizzas (sabor, preco, tamanho, meia, categoria_id) values ("calabresa", 55.90, "grande", true, 4);
INSERT INTO tb_pizzas (sabor, preco, tamanho, meia, categoria_id) values ("churros", 30.90, "broto", true, 1);

select * from tb_pizzas WHERE preco > 45.00;
select * from tb_pizzas WHERE preco > 50.00 and preco <100;
select * from tb_pizzas WHERE sabor like "%m%";
select * from tb_pizzas inner join tb_categorias on tb_categorias.id = tb_pizzas.categoria_id;
select * from tb_pizzas inner join tb_categorias on tb_categorias.id = tb_pizzas.categoria_id
WHERE tb_categorias.tipo = "doce";

