USE DB_RH;

CREATE TABLE TB_COLABORADORES(
ID BIGINT auto_increment,
nomePronome varchar(255),
endereco varchar(255),
matricula double,
salario double,
contato varchar(255),
primary key(id)
);

SELECT * FROM TB_COLABORADORES;

INSERT INTO TB_COLABORADORES (nomePronome, endereco, matricula, salario, contato) values ('Bruna ela/dela', 'Rua da gloria', 4469, 5000, 1199999999);
INSERT INTO TB_COLABORADORES (nomePronome, endereco, matricula, salario, contato) values ('Rafael ele/dele', 'Rua da gloria', 1111, 10000, 118888888);
INSERT INTO TB_COLABORADORES (nomePronome, endereco, matricula, salario, contato) values ('Victor ele/dele', 'Rua X', 0123, 3000, 1199999999);
INSERT INTO TB_COLABORADORES (nomePronome, endereco, matricula, salario, contato) values ('Pedro ele/dele', 'Rua Y', 2222, 4000, 1199999999);
INSERT INTO TB_COLABORADORES (nomePronome, endereco, matricula, salario, contato) values ('Victoria ela/dela', 'Rua Z', 8888, 5000, 1199999999);
INSERT INTO TB_COLABORADORES (nomePronome, endereco, matricula, salario, contato) values ('Carol ela/dela', 'Rua T', 0978, 7000, 1199999999);
INSERT INTO TB_COLABORADORES (nomePronome, endereco, matricula, salario, contato) values ('Van ela/dela', 'Rua R', 8765, 45000, 1199999999);
INSERT INTO TB_COLABORADORES (nomePronome, endereco, matricula, salario, contato) values ('Clara ela/dela', 'Rua M', 9870, 7500, 1199999999);

SELECT * FROM TB_COLABORADORES WHERE salario > 2000;
SELECT * FROM TB_COLABORADORES WHERE salario < 2000;

UPDATE TB_COLABORADORES
SET salario = 1500
WHERE id = 3;

UPDATE TB_COLABORADORES
SET salario = 1800
WHERE id= 6;