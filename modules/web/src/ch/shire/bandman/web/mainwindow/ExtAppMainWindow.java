/*
 * Copyright (c) 2016 Bandman
 */
package ch.shire.bandman.web.mainwindow;

import com.haulmont.cuba.web.app.mainwindow.AppMainWindow;

import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.actions.CreateAction;
import com.haulmont.cuba.gui.components.actions.EditAction;

import javax.inject.Named;
import java.util.Map;

/**
 * @author user
 */
public class ExtAppMainWindow extends AppMainWindow {
    @Named("shoppingTable.create")
    protected CreateAction shoppingTableCreate;
    @Named("shoppingTable.edit")
    protected EditAction shoppingTableEdit;
    @Named("todoTable.create")
    protected CreateAction todoTableCreate;
    @Named("todoTable.edit")
    protected EditAction todoTableEdit;
    @Named("bookingTable.create")
    protected CreateAction bookingTableCreate;
    @Named("bookingTable.edit")
    protected EditAction bookingTableEdit;
    @Override
    public void init(Map<String, Object> params) {
        shoppingTableCreate.setOpenType(WindowManager.OpenType.DIALOG);
        shoppingTableEdit.setOpenType(WindowManager.OpenType.DIALOG);
        todoTableCreate.setOpenType(WindowManager.OpenType.DIALOG);
        todoTableEdit.setOpenType(WindowManager.OpenType.DIALOG);
        bookingTableCreate.setOpenType(WindowManager.OpenType.DIALOG);
        bookingTableEdit.setOpenType(WindowManager.OpenType.DIALOG);
    }

}
