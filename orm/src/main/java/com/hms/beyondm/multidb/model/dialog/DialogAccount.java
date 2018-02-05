package com.hms.beyondm.multidb.model.dialog;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="dialog_account")
public class DialogAccount implements Serializable{

    private static final long serialVersionUID = 7907557244205936381L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private long id;

    @Column(name = "username", nullable = false)
    private String name;

    @Column(name = "msisdn", nullable = false)
    private String msisdn;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }
}
