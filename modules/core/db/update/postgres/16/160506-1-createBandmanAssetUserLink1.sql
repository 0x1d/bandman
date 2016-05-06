create table BANDMAN_ASSET_USER_LINK (
    ASSET_ID uuid,
    USER_ID uuid,
    primary key (ASSET_ID, USER_ID)
);
