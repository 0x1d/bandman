/*
 * Copyright (c) 2016 Bandman
 */
package ch.shire.bandman.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.security.entity.User;
import java.util.Date;
import java.util.Set;
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
@Table(name = "BANDMAN_TO_DO")
@Entity(name = "bandman$ToDo")
public class ToDo extends StandardEntity {
    private static final long serialVersionUID = 1322774965275112347L;

    @Column(name = "TASK_NAME", nullable = false)
    protected String taskName;

    @JoinTable(name = "BANDMAN_TO_DO_USER_LINK",
        joinColumns = @JoinColumn(name = "TO_DO_ID"),
        inverseJoinColumns = @JoinColumn(name = "USER_ID"))
    @ManyToMany
    protected Set<User> taskUser;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DUE_DATE")
    protected Date dueDate;

    @Column(name = "FINISHED")
    protected Boolean finished;

    @Column(name = "DESCRIPTION", length = 1024)
    protected String description;

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }


    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskUser(Set<User> taskUser) {
        this.taskUser = taskUser;
    }

    public Set<User> getTaskUser() {
        return taskUser;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public Boolean getFinished() {
        return finished;
    }


}