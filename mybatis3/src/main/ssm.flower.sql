create database ssm default character set utf8;
use ssm;
create table flower(
  id int primary key auto_increment,
  name varchar(20) not null,
  price float not null,
  location varchar(20)
);
insert into flower value (default,'天竺葵',3.6,'印度');
insert into flower value (default,'牡丹',5.2,'河南-洛阳');
select * from flower;

//delete from flower where id in (select id from flower limit 3,4);
delete from flower limit 3,4;