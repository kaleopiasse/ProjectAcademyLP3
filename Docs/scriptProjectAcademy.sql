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
primary key (cpf));

create table product (
id_product integer,
name varchar(50),
description varchar (100),
price float,
primary key (id_product));

create table modality(
id_modality integer,
name varchar(50),
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
cpf_student varchar(11),
date_maturity date,
price float,
type varchar(50),
plan varchar(50),
primary key (cpf_student, date_maturity),
foreign key (cpf_student) references student (cpf_student));


//sites uteis
// https://pt.icons8.com/icon/set/login/win8
