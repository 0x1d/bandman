/*
 * Copyright (c) 2016 Bandman
 */
package ch.shire.bandman.gui.inventory;

import com.haulmont.cuba.gui.components.AbstractWindow;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.WindowManager;
import com.haulmont.cuba.gui.components.actions.CreateAction;
import com.haulmont.cuba.gui.components.actions.EditAction;

import javax.inject.Named;
import java.util.Map;

/**
 * @author user
 */
public class InventoryEdit extends AbstractEditor {
        
    @Named("assetTable.create")
    protected CreateAction assetTableCreate;
    @Named("assetTable.edit")
    protected EditAction assetTableEdit;
    
    @Override
    public void init(Map<String, Object> params) {
        assetTableCreate.setOpenType(WindowManager.OpenType.DIALOG);
        assetTableEdit.setOpenType(WindowManager.OpenType.DIALOG);
    }

}