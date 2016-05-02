/*
 * Copyright (c) 2016 Bandman
 */
package ch.shire.bandman.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 * @author user
 */
@Table(name = "BANDMAN_ASSET")
@Entity(name = "bandman$Asset")
public class Asset extends StandardEntity {
    private static final long serialVersionUID = -7708775863786356957L;

    @Column(name = "NAME")
    protected String name;


    @Column(name = "QUANTITY")
    protected Integer quantity;

    @Column(name = "PRICE")
    protected Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INVENTORY_ID")
    protected Inventory inventory;

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }


    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Inventory getInventory() {
        return inventory;
    }


    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getQuantity() {
        return quantity;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


}