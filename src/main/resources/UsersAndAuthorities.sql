create table UESRS(
	USERNAME varchar(50) not null primary key,
	PASSWORD varchar(50) not null,
	ENABLED bit not null
);

create table AUTHORITIES (
	USERNAME varchar(50) not null,
	AUTHORITY varchar(50) not null,
	constraint fk_authorities_users foreign key(USERNAME) references UESRS(USERNAME)
);
create unique index ix_auth_username on authorities (USERNAME,AUTHORITY);