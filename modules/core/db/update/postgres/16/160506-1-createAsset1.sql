create table BANDMAN_ASSET (
    ID uuid,
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
    INVENTORY_ID uuid,
    --
    primary key (ID)
);
