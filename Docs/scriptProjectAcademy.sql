create database ProjectAcademy;

use ProjectAcademy;

create table person ( 
cpf varchar (11), 
name varchar(50), 
sex varchar(12), 
street varchar(30), 
district varchar(30),
num integer, 
cep varchar(9), 
city varchar(30),  
estado varchar(2),
complement varchar(30),
primary key (cpf));

create table product (
id_product integer,
name varchar(50),
description varchar (100),
price float,
primary key (id_product));

create table modality(
id_modality integer auto_increment,
name varchar(50),
price decimal(10,2),
primary key (id_modality));

create table training_plan (
id_training_plan integer,
nm_repeats integer,
exercises varchar(50),
nm_series integer,
primary key (id_training_plan));

create table student (
cpf_student varchar(11),
situation varchar(25),
primary key (cpf_student),
foreign key (cpf_student) references person (cpf));

create table monthly (
id_monthly integer auto_increment,
cpf_student varchar(11),
dateRegistration date,
modality1 varchar(30),
modaltiy2 varchar(30),
numPortion integer,
datePortion date,
price decimal(10,2),
plan varchar(50),
primary key (id_monthly, cpf_student),
foreign key (cpf_student) references student (cpf_student));

create table person_email(
cpf_email varchar(11),
email varchar(30),
primary_key (cpf_email, email),
foreign key (cpf_email) references person (cpf));

create table person_phone(
cpf_phone varchar(11),
phone varchar(30),
primary key (cpf_phone, phone),
foreign key (cpf_phone) references person (cpf));

insert into person (cpf,name,sex,street,district,num,cep,city,estado,complement) 
	   values ("39958446855","Kaleo Aparecido Piasse","Masculino","Avenida Perimetral","Jardim Industrial",1031,"13571385","São Carlos","SP","Bloco 27 apto 502"),
			  ("39958446856","Son Goku","Masculino","Distrito Leste","Distrito Leste",439,"13571386","terra","SP","loucura"),
			  ("39958446857","Uzumaki Naruto","Masculino","Rua dos Ninjas","Area Sul",566,"13571387","Konoha Sempu","SP","apto 502"),
			  ("39958446858","Light Yagami","Masculino","Daikoku","Centro",777,"13571388","To-Ch","RJ","nenhum"),
			  ("39958446859","Edward Elric","Masculino","Resembool","Campo",888,"13571389","Amestris","TO","nenhum");

insert into student (cpf_student, situation) 
	   values ("39958446855","Ativo"),
	          ("39958446856","Ativo"),
			  ("39958446857","Ativo"),
			  ("39958446858","Bloqueado"),
			  ("39958446859","Inativo");

insert into modality (name,price) values ("Nenhuma",0.00), ("Muay Thai",75.00), ("Kung Fu",75.00), ("Boxe",75.00), ("Musculação",65.00), ("MMA",95.00);

//sites uteis
// https://pt.icons8.com/icon/set/login/win8
// https://www.mockaroo.com/
