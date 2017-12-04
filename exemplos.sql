SQL

DDL
drop table aluno;
create table aluno(
	matricula int not null,
	nome varchar(100) not null,
	email varchar(100),
	primary key (matricula)
);




insert into aluno(nome, matricula) 
	values ('Rafael',120091);
insert into aluno 
	values (400054, 'Rafael Amaral Fabris', 'rafafabris13@gmail.com');

update aluno set 
	email='gmail@gmail.com',
	nome='Gmail dos Santos'
where matricula = 120098;

delete from aluno
where matricula = 120098;

select matricula, nome from aluno