create table BANDMAN_BOOKING (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BOOKING_START timestamp not null,
    BOOKING_END timestamp not null,
    TITLE varchar(255) not null,
    DESCRIPTION varchar(1024),
    DO_NOT_DISTURB boolean,
    --
    primary key (ID)
);
