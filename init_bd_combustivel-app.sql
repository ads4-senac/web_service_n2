-- Criacao de banco
-- drop database Locadora;
-- create database Locadora;

-- Criacao de tabelas
drop table if exists abastecimento cascade;
create table abastecimento (
	id           bigserial not null primary key,
	data         bigint,
	placa        varchar(10),
	odo          integer,
	posto        varchar(50),
	litros       decimal,
	preco_pago   decimal,
	tipo_veiculo varchar(10)
);
-- create table modelo (mod_id	serial not null	primary key, mod_descricao	varchar(60), mar_id int	not null, constraint rel_marca_modelo foreign key (mar_id) references marca);
-- Insercao de dados
truncate table abastecimento;
insert into abastecimento values (1, 1574019975841/1000, 'aaa-9999', 1000, 'Abasteca aqui', 13.56, 35.67, 'moto');

select * from abastecimento;
SELECT (EXTRACT(EPOCH FROM now()) * 1000)::bigint;