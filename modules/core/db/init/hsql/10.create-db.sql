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
    PRICE double precision,
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
-- begin BANDMAN_ASSET_USER_LINK
create table BANDMAN_ASSET_USER_LINK (
    ASSET_ID varchar(36) not null,
    USER_ID varchar(36) not null,
    primary key (ASSET_ID, USER_ID)
)^
-- end BANDMAN_ASSET_USER_LINK
-- begin BANDMAN_BOOKING
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
)^
-- end BANDMAN_BOOKING
-- begin BANDMAN_BOOKING_USER_LINK
create table BANDMAN_BOOKING_USER_LINK (
    BOOKING_ID varchar(36) not null,
    USER_ID varchar(36) not null,
    primary key (BOOKING_ID, USER_ID)
)^
-- end BANDMAN_BOOKING_USER_LINK
-- begin BANDMAN_EXPENSE
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
    SETTLED boolean,
    --
    primary key (ID)
)^
-- end BANDMAN_EXPENSE
