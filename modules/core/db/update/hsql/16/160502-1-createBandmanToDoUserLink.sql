create table BANDMAN_TO_DO_USER_LINK (
    TO_DO_ID varchar(36) not null,
    USER_ID varchar(36) not null,
    primary key (TO_DO_ID, USER_ID)
);
