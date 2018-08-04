create table users
(
   id integer not null,
   firstname varchar(255) not null,
   lastname varchar(255) not null,
   email varchar(255) not null,
   phone varchar(255) not null,
   educational_level varchar(255) not null,
   YearsExpirience int(10) not null,
   primary key(id)
);