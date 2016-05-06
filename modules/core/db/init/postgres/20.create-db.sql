-- begin BANDMAN_INVENTORY
create unique index IDX_BANDMAN_INVENTORY_UNIQ_NAME on BANDMAN_INVENTORY (NAME) where DELETE_TS is null ^
-- end BANDMAN_INVENTORY
-- begin BANDMAN_ASSET
alter table BANDMAN_ASSET add constraint FK_BANDMAN_ASSET_INVENTORY_ID foreign key (INVENTORY_ID) references BANDMAN_INVENTORY(ID)^
create index IDX_BANDMAN_ASSET_INVENTORY on BANDMAN_ASSET (INVENTORY_ID)^
-- end BANDMAN_ASSET
-- begin BANDMAN_EXPENSE
alter table BANDMAN_EXPENSE add constraint FK_BANDMAN_EXPENSE_BUYER_ID foreign key (BUYER_ID) references SEC_USER(ID)^
create index IDX_BANDMAN_EXPENSE_BUYER on BANDMAN_EXPENSE (BUYER_ID)^
-- end BANDMAN_EXPENSE
-- begin BANDMAN_BOOKING_USER_LINK
alter table BANDMAN_BOOKING_USER_LINK add constraint FK_BBUL_BOOKING foreign key (BOOKING_ID) references BANDMAN_BOOKING (ID)^
alter table BANDMAN_BOOKING_USER_LINK add constraint FK_BBUL_USER foreign key (USER_ID) references SEC_USER (ID)^
-- end BANDMAN_BOOKING_USER_LINK
-- begin BANDMAN_ASSET_USER_LINK
alter table BANDMAN_ASSET_USER_LINK add constraint FK_BAUL_ASSET foreign key (ASSET_ID) references BANDMAN_ASSET (ID)^
alter table BANDMAN_ASSET_USER_LINK add constraint FK_BAUL_USER foreign key (USER_ID) references SEC_USER (ID)^
-- end BANDMAN_ASSET_USER_LINK
-- begin BANDMAN_TO_DO_USER_LINK
alter table BANDMAN_TO_DO_USER_LINK add constraint FK_BTDUL_TO_DO foreign key (TO_DO_ID) references BANDMAN_TO_DO (ID)^
alter table BANDMAN_TO_DO_USER_LINK add constraint FK_BTDUL_USER foreign key (USER_ID) references SEC_USER (ID)^
-- end BANDMAN_TO_DO_USER_LINK
