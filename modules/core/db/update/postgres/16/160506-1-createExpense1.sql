create table BANDMAN_EXPENSE (
    ID uuid,
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
    BUYER_ID uuid not null,
    PRICE double precision not null,
    COMMENT_ varchar(1024),
    SETTLED boolean,
    --
    primary key (ID)
);
