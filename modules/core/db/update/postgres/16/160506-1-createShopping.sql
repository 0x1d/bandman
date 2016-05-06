create table BANDMAN_SHOPPING (
    ID uuid,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ITEM varchar(255),
    BOUGHT boolean,
    DESCRIPTION varchar(1024),
    --
    primary key (ID)
);
