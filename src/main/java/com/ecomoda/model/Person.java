package com.ecomoda.model;

import java.io.Serializable;

public class Person  implements Serializable {

    public Person() {

    }

    private String id;
    private String fullname;
    private String idType ;
    private String idNumber;

    public String getId() {
        return id;
    }

    public String getFullname() {
        return fullname;
    }

    public String getIdType() {
        return idType;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public void setIdType(String idType) {
        this.idType = idType;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
}
