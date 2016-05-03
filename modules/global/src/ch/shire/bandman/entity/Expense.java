/*
 * Copyright (c) 2016 Bandman
 */
package ch.shire.bandman.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.security.entity.User;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;

/**
 * @author user
 */
@Table(name = "BANDMAN_EXPENSE")
@Entity(name = "bandman$Expense")
public class Expense extends StandardEntity {
    private static final long serialVersionUID = 7523987041225856372L;

    @Temporal(TemporalType.DATE)
    @Column(name = "EXPENSE_DATE", nullable = false)
    protected Date expenseDate;

    @Column(name = "ITEM", nullable = false)
    protected String item;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BUYER_ID")
    protected User buyer;

    @Column(name = "PRICE", nullable = false)
    protected Double price;

    @Column(name = "COMMENT_", length = 1024)
    protected String comment;

    @Column(name = "SETTLED")
    protected Boolean settled;

    public void setSettled(Boolean settled) {
        this.settled = settled;
    }

    public Boolean getSettled() {
        return settled;
    }


    public void setExpenseDate(Date expenseDate) {
        this.expenseDate = expenseDate;
    }

    public Date getExpenseDate() {
        return expenseDate;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getItem() {
        return item;
    }

    public void setBuyer(User buyer) {
        this.buyer = buyer;
    }

    public User getBuyer() {
        return buyer;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPrice() {
        return price;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getComment() {
        return comment;
    }


}