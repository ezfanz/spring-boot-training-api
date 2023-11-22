insert into user_details(id,ic,birth_date,name)
values(10001, '960928105925', current_date(), 'Irfan');

insert into user_details(id,ic,birth_date,name)
values(10002, '960928105927', current_date(), 'Ahmad');

insert into user_details(id,ic,birth_date,name)
values(10003, '960928105928', current_date(), 'Ali');

insert into post(id, description, user_id)
values(20001, 'I want to learn AWS', 10001);

insert into post(id, description, user_id)
values(20002, 'I want to learn DevOps', 10001);

insert into post(id, description, user_id)
values(20003, 'I want to Get AWS Certified', 10002);

insert into post(id, description, user_id)
values(20004, 'I want to learn Multi Cloud', 10003);

insert into topic(id, silibus, user_id)
values(20004, 'silibus kementarian', 10001);

insert into topic(id, silibus, user_id)
values(20005, 'silibus kemahiran', 10001);