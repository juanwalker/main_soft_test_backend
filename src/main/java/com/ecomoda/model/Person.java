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
}
