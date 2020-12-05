create sequence person_seq increment 1;

create table person (
    person_id bigint default nextval('person_seq'::regclass) not null
                    constraint person_pk primary key,
    first_name varchar(256) not null,
    last_name varchar(256) not null,
    middle_name varchar(256) not null,
    birth_date date,
    gender varchar(100) not null);

    comment on table person  is 'Information about person';
    comment on column person.person_id is 'identificator';
    comment on column person.first_name is 'first_name';
    comment on column person.last_name is 'last_name';
    comment on column person.middle_name is 'middle_name';
    comment on column person.birth_date is 'birth_date';
    comment on column person.gender is 'gender';


create sequence employment_seq increment 1;
create table employment(
    employment_id bigint default nextval('employment_seq'::regclass)
        not null constraint employment_pk primary key,
    version integer not null,
    start_dt date,
    end_dt date,
    work_type_id bigint,
    organization_name varchar(256),
    organization_address text,
    position_name varchar(256),
    person_id bigint);

comment on table employment  is 'employment record';
comment on column employment.employment_id is 'identificator';
comment on column employment.version is 'optimistic blocking';
comment on column employment.start_dt is 'employment start date';
comment on column employment.end_dt is 'employment end date';
comment on column employment.work_type_id is 'work type';
comment on column employment.organization_name is 'organization name';
comment on column employment.organization_address is 'organization address';
comment on column employment.position_name is 'position';

alter table employment add constraint person_id_fk foreign key (person_id)
references person(person_id);