create sequence if not exists resume_id_seq
  minvalue 1
  start with 1
  increment by 10;

create table if not exists resume (
  id int not null default nextval('resume_id_seq') primary key,
  description text
);
