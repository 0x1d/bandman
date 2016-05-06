alter table BANDMAN_ASSET_USER_LINK add constraint FK_BAUL_ASSET foreign key (ASSET_ID) references BANDMAN_ASSET (ID);
alter table BANDMAN_ASSET_USER_LINK add constraint FK_BAUL_USER foreign key (USER_ID) references SEC_USER (ID);
