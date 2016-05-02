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
    --
    primary key (ID)
);
