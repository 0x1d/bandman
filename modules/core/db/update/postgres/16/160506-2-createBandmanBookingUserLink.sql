alter table BANDMAN_BOOKING_USER_LINK add constraint FK_BBUL_BOOKING foreign key (BOOKING_ID) references BANDMAN_BOOKING (ID);
alter table BANDMAN_BOOKING_USER_LINK add constraint FK_BBUL_USER foreign key (USER_ID) references SEC_USER (ID);
