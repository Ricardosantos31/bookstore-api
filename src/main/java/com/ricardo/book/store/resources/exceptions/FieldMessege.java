package com.ricardo.book.store.resources.exceptions;

import java.io.Serializable;

public class FieldMessege implements Serializable {

    private String fieldname;
    private String messege;

    public FieldMessege() {
        super();
    }

    public FieldMessege(String fieldname, String messege) {
        this.fieldname = fieldname;
        this.messege = messege;
    }

    public String getFieldname() {
        return fieldname;
    }

    public void setFieldname(String fieldname) {
        this.fieldname = fieldname;
    }

    public String getMessege() {
        return messege;
    }

    public void setMessege(String messege) {
        this.messege = messege;
    }
}
