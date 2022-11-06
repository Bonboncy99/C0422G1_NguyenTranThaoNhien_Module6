drop database if exists book_store;
create database book_store;
use book_store;

create table role (
	id_role int primary key auto_increment,
    role_name varchar(255)
);

create table user (
id_user int primary key auto_increment,
name varchar(250),
phone varchar(20),
email varchar(250),
address varchar(250),
money int
);

create table account (
id_account int primary key auto_increment,
username varchar(250),
password varchar(250),
id_user int(250),
foreign key (id_user) references user(id_user)
);

create table account_role (
id_account int,
id_role int,
primary key(id_account, id_role),
foreign key (id_account) references account(id_account),
foreign key (id_role) references role(id_role)
);


create table category (
id_category int primary key auto_increment,
name varchar(250)
);

create table book (
id_book int primary key auto_increment,
title varchar(250),
author varchar(250),
decription varchar(250),
price int,
quantity int
);

create table book_detail (
id_book int,
id_category int,
primary key(id_book,id_category),
foreign key (id_book) references book(id_book),
foreign key (id_category) references category(id_category)
);

create table cart (
id_cart int primary key auto_increment,
id_account int,
foreign key (id_account) references account(id_account)
);

create table cart_detail (
id_cart int,
id_book int,
primary key(id_cart, id_book),
foreign key (id_cart) references cart(id_cart),
foreign key (id_book) references book(id_book)
);

create table invoice (
id_invoice int primary key auto_increment,
timestamp datetime,
code varchar(30),
id_account int,
foreign key (id_account) references account(id_account)
);

create table invoice_detail (
id_invoice_detail int primary key auto_increment,
id_book int,
quatity_pay int,
id_invoice int,
foreign key (id_invoice) references invoice(id_invoice),
foreign key (id_book) references book(id_book)
);

