/*
 * Copyright (c) 2016 Bandman
 */
package ch.shire.bandman.gui.shopping;

import com.haulmont.cuba.gui.components.AbstractLookup;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.actions.CreateAction;
import com.haulmont.cuba.gui.components.actions.EditAction;

import javax.inject.Named;
import java.util.Map;

/**
 * @author user
 */
public class ShoppingBrowse extends AbstractLookup {
    @Named("shoppingsTable.create")
    protected CreateAction shoppingTableCreate;
    @Named("shoppingsTable.edit")
    protected EditAction shoppingTableEdit;
    @Override
    public void init(Map<String, Object> params) {
        shoppingTableCreate.setOpenType(WindowManager.OpenType.DIALOG);
        shoppingTableEdit.setOpenType(WindowManager.OpenType.DIALOG);
    }
}