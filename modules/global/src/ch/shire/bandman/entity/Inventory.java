/*
 * Copyright (c) 2016 Bandman
 */
package ch.shire.bandman.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.Set;
import javax.persistence.OneToMany;
import javax.persistence.Column;
import com.haulmont.chile.core.annotations.Composition;

/**
 * @author user
 */
@Table(name = "BANDMAN_INVENTORY")
@Entity(name = "bandman$Inventory")
public class Inventory extends StandardEntity {
    private static final long serialVersionUID = -8816575969908786818L;

    @Column(name = "NAME", nullable = false, unique = true)
    protected String name;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "inventory")
    protected Set<Asset> assets;

    public void setAssets(Set<Asset> assets) {
        this.assets = assets;
    }

    public Set<Asset> getAssets() {
        return assets;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



}