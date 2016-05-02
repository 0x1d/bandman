/*
 * Copyright (c) 2016 Bandman
 */
package ch.shire.bandman.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;

/**
 * @author user
 */
@Table(name = "BANDMAN_SHOPPING")
@Entity(name = "bandman$Shopping")
public class Shopping extends StandardEntity {
    private static final long serialVersionUID = 357692860616170930L;

    @Column(name = "ITEM")
    protected String item;

    @Column(name = "BOUGHT")
    protected Boolean bought;

    @Column(name = "DESCRIPTION", length = 1024)
    protected String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setBought(Boolean bought) {
        this.bought = bought;
    }

    public Boolean getBought() {
        return bought;
    }


}