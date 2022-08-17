package com.company.dto;

public class Facultet {
    private long id;
    private String name;
    private int founded;

    private long idEducationalInstitution;
    private long idPerson;

    public Facultet(){}

    public Facultet(long id, String name, int founded, long idEducationalInstitution, long idPerson){
        this.id = id;
        this.name = name;
        this.founded = founded;
        this.idEducationalInstitution = idEducationalInstitution;
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

    public long getIdEducationalInstitution() {
        return idEducationalInstitution;
    }

    public void setIdEducationalInstitution(long idEducationalInstitution) {
        this.idEducationalInstitution = idEducationalInstitution;
    }

    public long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }
}
