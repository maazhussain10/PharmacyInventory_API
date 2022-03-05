CREATE DATABASE pharmacyInventory;

USE pharmacyInventory;

CREATE TABLE users(id int primary key not null auto_increment, firstname varchar(20),lastname varchar(20),gender varchar(6),email varchar(45), password varchar(40));

CREATE TABLE medicinelists(productid int primary key not null auto_increment, medicineName varchar(20), Stock varchar(20), MRP int, Offer varchar(20));

insert into medicinelists(Product_ID, Medicine_Name, Stock, MRP, Offer)
values('1001', 'Advair Diskus', '95', '550', '1+1');

insert into medicinelists(Product_ID, Medicine_Name, Stock, MRP, Offer)
values('2004', 'Glycomet GP', '80', '350', '9+1');

insert into medicinelists(Product_ID, Medicine_Name, Stock, MRP, Offer)
values('3104', 'Lantus Solostar', '40', '250', '5+1');

insert into medicinelists(Product_ID, Medicine_Name, Stock, MRP, Offer)
values('4507', 'Betadine Solution', '20', '890', '0+0');

insert into medicinelists(Product_ID, Medicine_Name, Stock, MRP, Offer)
values('5706', 'Synthriod', '45', '790', '1+0');

insert into medicinelists(Product_ID, Medicine_Name, Stock, MRP, Offer)
values('6201', 'Paracetomol', '145', '190', '4+1');