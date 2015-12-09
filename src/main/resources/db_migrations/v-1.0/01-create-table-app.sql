--liquibase formatted sql

--changeset alex:1
create table app (
    id int primary key,
    name varchar(255)
);
--rollback drop table test1;

--changeset alex:2
insert into app(id, name) values (1, 'application1');
insert into app(id, name) values (2, 'application2');
