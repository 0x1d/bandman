/*
 * Copyright (c) 2016 Bandman
 */
package ch.shire.bandman.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.security.entity.User;
import java.util.Date;
import java.util.LinkedHashSet;
import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.haulmont.cuba.core.entity.StandardEntity;

/**
 * @author user
 */
@Table(name = "BANDMAN_BOOKING")
@Entity(name = "bandman$Booking")
public class Booking extends StandardEntity {
    private static final long serialVersionUID = 603249775143447698L;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "BOOKING_START", nullable = false)
    protected Date bookingStart;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "BOOKING_END", nullable = false)
    protected Date bookingEnd;

    @Column(name = "TITLE", nullable = false)
    protected String title;

    @Column(name = "DESCRIPTION", length = 1024)
    protected String description;

    @JoinTable(name = "BANDMAN_BOOKING_USER_LINK",
        joinColumns = @JoinColumn(name = "BOOKING_ID"),
        inverseJoinColumns = @JoinColumn(name = "USER_ID"))
    @ManyToMany
    protected LinkedHashSet<User> participants;

    @Column(name = "DO_NOT_DISTURB")
    protected Boolean doNotDisturb;

    public void setBookingStart(Date bookingStart) {
        this.bookingStart = bookingStart;
    }

    public Date getBookingStart() {
        return bookingStart;
    }

    public void setBookingEnd(Date bookingEnd) {
        this.bookingEnd = bookingEnd;
    }

    public Date getBookingEnd() {
        return bookingEnd;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setParticipants(LinkedHashSet<User> participants) {
        this.participants = participants;
    }

    public LinkedHashSet<User> getParticipants() {
        return participants;
    }

    public void setDoNotDisturb(Boolean doNotDisturb) {
        this.doNotDisturb = doNotDisturb;
    }

    public Boolean getDoNotDisturb() {
        return doNotDisturb;
    }


}