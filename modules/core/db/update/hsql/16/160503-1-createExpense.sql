create table BANDMAN_EXPENSE (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    EXPENSE_DATE date not null,
    ITEM varchar(255) not null,
    BUYER_ID varchar(36) not null,
    PRICE double precision not null,
    COMMENT_ varchar(1024),
    --
    primary key (ID)
);
