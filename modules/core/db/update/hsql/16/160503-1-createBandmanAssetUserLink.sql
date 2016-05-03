create table BANDMAN_ASSET_USER_LINK (
    ASSET_ID varchar(36) not null,
    USER_ID varchar(36) not null,
    primary key (ASSET_ID, USER_ID)
);
