alter table item drop constraint fk_item_supplier;
alter table item drop constraint fk_item_transporter;

alter table product_item drop constraint fk_product_item_product;
alter table product_item drop constraint fk_product_item_item;

alter table supplier_tra drop constraint fk_supplier_tra_supplier;
alter table supplier_tra drop constraint fk_supplier_tra_language;

alter table transporter_tra drop constraint fk_transporter_tra_transporter;
alter table transporter_tra drop constraint fk_transporter_tra_language;

ALTER TABLE PRODUCT_TRA DROP CONSTRAINT FK_PRODUCT_TRA_PRODUCT;
ALTER TABLE PRODUCT_TRA DROP CONSTRAINT FK_PRODUCT_TRA_LANGUAGE;

alter table item_tra drop constraint fk_item_tra_item;
alter table item_tra drop constraint fk_item_tra_language;

drop table language if exists;
create table language (
	id int, 
	name varchar(200), 
	primary key(id)
);

drop table supplier if exists;
create table supplier (
	id int, 
	name varchar(200), 
	primary key(id)
);

drop table transporter if exists;
create table transporter (
	id int, 
	name varchar(200), 
	description varchar(300),
	primary key(id)
);


drop table product if exists;
create table product (
	id int, 
	name varchar(200), 
	primary key(id),
);


drop table item if exists;
create table item (
	id int,
	qr_code varchar(100),
	name varchar(200), 
	description varchar(300),
	supplier_id int,
	transporter_id int,
	primary key(id),
	constraint fk_item_supplier foreign key(supplier_id) references supplier(id),
	constraint fk_item_transporter foreign key(transporter_id) references transporter(id)
);

drop table product_item if exists;
create table product_item(
	product_id int,
	item_id int,
	primary key(product_id, item_id),
	constraint fk_product_item_product  foreign key(product_id) references product(id),
	constraint fk_product_item_item foreign key(item_id)  references item(id)
);

drop table supplier_tra if exists;
create table supplier_tra (
	id int,
	supplier_id int,
	language_id int,
	description varchar(300),
	constraint fk_supplier_tra_supplier foreign key(supplier_id) references supplier(id),
	constraint fk_supplier_tra_language foreign key(language_id) references language(id),
	primary key (id, supplier_id, language_id)
);


drop table product_tra if exists;
create table product_tra (
	id int,
	product_id int,
	language_id int,
	description varchar(300),
	constraint fk_product_tra_product foreign key(product_id) references product(id),
	constraint fk_product_tra_language foreign key(language_id) references language(id),
	primary key (id, product_id, language_id)
);

drop table transporter_tra if exists;
create table transporter_tra (
	id int,
	transporter_id int,
	language_id int,
	description varchar(300),
	constraint fk_transporter_tra_transporter foreign key(transporter_id) references transporter(id),
	constraint fk_transporter_tra_language foreign key(language_id) references language(id),
	primary key (id, transporter_id, language_id)
);

drop table item_tra if exists;
create table item_tra (
	id int,
	item_id int,
	language_id int,
	description varchar(300),
	constraint fk_item_tra_item foreign key(item_id) references item(id),
	constraint fk_item_tra_language foreign key(language_id) references language(id),
	primary key (id, item_id, language_id)
);
