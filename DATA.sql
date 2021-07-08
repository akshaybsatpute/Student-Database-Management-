create database std_data;
use std_data;
create table data(Name varchar(50),Roll_No int primary key,Age int,Branch varchar(20),Gender varchar(20),Mobile_No varchar(20),Year varchar(20),Email_ID varchar(50),Address varchar(200),Image blob);
select * from data;