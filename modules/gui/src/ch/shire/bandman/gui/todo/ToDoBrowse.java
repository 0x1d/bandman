/*
 * Copyright (c) 2016 Bandman
 */
package ch.shire.bandman.gui.todo;

import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.actions.CreateAction;
import com.haulmont.cuba.gui.components.actions.EditAction;

import javax.inject.Named;
import java.util.Map;

/**
 * @author user
 */
public class ToDoBrowse extends AbstractLookup {
    @Named("toDoesTable.create")
    protected CreateAction todoTableCreate;
    @Named("toDoesTable.edit")
    protected EditAction todoTableEdit;
    @Override
    public void init(Map<String, Object> params) {
        todoTableCreate.setOpenType(WindowManager.OpenType.DIALOG);
        todoTableEdit.setOpenType(WindowManager.OpenType.DIALOG);
    }
}