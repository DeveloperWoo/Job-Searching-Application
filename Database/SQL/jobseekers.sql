use jobsearch

create table jobseekers(
jobseekerID int not null auto_increment,
firstName varchar(50) not null,
lastName varchar(50) not null,
phoneNum varchar(20) not null,
email varchar(50) not null,
primary key(jobseekerID)
);

select * from jobseekers;
