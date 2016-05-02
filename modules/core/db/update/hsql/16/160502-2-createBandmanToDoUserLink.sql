alter table BANDMAN_TO_DO_USER_LINK add constraint FK_BTDUL_TO_DO foreign key (TO_DO_ID) references BANDMAN_TO_DO (ID);
alter table BANDMAN_TO_DO_USER_LINK add constraint FK_BTDUL_USER foreign key (USER_ID) references SEC_USER (ID);
