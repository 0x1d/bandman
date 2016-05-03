package ch.shire.bandman.web;

import com.haulmont.cuba.web.DefaultApp;
import com.haulmont.charts.web.gui.ChartComponentPalette;
import com.haulmont.cuba.web.gui.WebUIPaletteManager;

public class App extends DefaultApp {
    static {
        WebUIPaletteManager.registerPalettes(new ChartComponentPalette());
    }
}