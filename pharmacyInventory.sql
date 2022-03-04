CREATE DATABASE pharmacyInventory;

USE pharmacyInventory;

CREATE TABLE users(id int primary key not null auto_increment, firstname varchar(20),lastname varchar(20),gender varchar(6),email varchar(45), password varchar(40));

CREATE TABLE medicine(id int primary key not null auto_increment, Name varchar(20), Type varchar(20) Quantity int);
