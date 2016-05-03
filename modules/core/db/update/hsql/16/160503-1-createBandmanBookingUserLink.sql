create table BANDMAN_BOOKING_USER_LINK (
    BOOKING_ID varchar(36) not null,
    USER_ID varchar(36) not null,
    primary key (BOOKING_ID, USER_ID)
);
