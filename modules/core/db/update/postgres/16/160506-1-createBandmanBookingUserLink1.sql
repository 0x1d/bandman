create table BANDMAN_BOOKING_USER_LINK (
    BOOKING_ID uuid,
    USER_ID uuid,
    primary key (BOOKING_ID, USER_ID)
);
