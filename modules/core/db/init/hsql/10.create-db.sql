-- begin BANDMAN_INVENTORY
create table BANDMAN_INVENTORY (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255) not null,
    --
    primary key (ID)
)^
-- end BANDMAN_INVENTORY
-- begin BANDMAN_ASSET
create table BANDMAN_ASSET (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    QUANTITY integer,
    INVENTORY_ID varchar(36),
    --
    primary key (ID)
)^
-- end BANDMAN_ASSET
-- begin BANDMAN_SHOPPING
create table BANDMAN_SHOPPING (
    ID varchar(36) not null,
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
)^
-- end BANDMAN_SHOPPING
-- begin BANDMAN_TO_DO
create table BANDMAN_TO_DO (
    ID varchar(36) not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    VERSION integer,
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TASK_NAME varchar(255) not null,
    DUE_DATE timestamp,
    FINISHED boolean,
    DESCRIPTION varchar(1024),
    --
    primary key (ID)
)^
-- end BANDMAN_TO_DO
-- begin BANDMAN_TO_DO_USER_LINK
create table BANDMAN_TO_DO_USER_LINK (
    TO_DO_ID varchar(36) not null,
    USER_ID varchar(36) not null,
    primary key (TO_DO_ID, USER_ID)
)^
-- end BANDMAN_TO_DO_USER_LINK
