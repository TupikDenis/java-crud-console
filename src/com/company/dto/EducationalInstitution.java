package com.company.dto;

public class EducationalInstitution {
    private long id;
    private String name;
    private int founded;

    private long idTown;
    private long idType;
    private long idPerson;

    public EducationalInstitution(){}

    public EducationalInstitution(long id, String name, int founded, long idTown, long idType, long idPerson){
        this.id = id;
        this.name = name;
        this.founded = founded;
        this.idTown = idTown;
        this.idType = idType;
        this.idPerson = idPerson;
    }

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

    public int getFounded() {
        return founded;
    }

    public void setFounded(int founded) {
        this.founded = founded;
    }

    public long getIdTown() {
        return idTown;
    }

    public void setIdTown(long idTown) {
        this.idTown = idTown;
    }

    public long getIdType() {
        return idType;
    }

    public void setIdType(long idType) {
        this.idType = idType;
    }

    public long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }
}
