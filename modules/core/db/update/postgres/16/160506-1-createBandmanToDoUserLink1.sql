create table BANDMAN_TO_DO_USER_LINK (
    TO_DO_ID uuid,
    USER_ID uuid,
    primary key (TO_DO_ID, USER_ID)
);
