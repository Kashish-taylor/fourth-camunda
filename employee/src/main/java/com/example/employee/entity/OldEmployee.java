package com.example.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OldEmployee {

    @Id
    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "pensionAmount")
    private Integer pensionAmount;

    @Column(name = "voterId")
    private Integer voterId;

    @Column(name = "rasanCard")
    private Integer rasanCard;

    public OldEmployee(){}

    public OldEmployee(String name, Integer age, Integer pensionAmount, Integer voterId, Integer rasanCard) {
        this.name = name;
        this.age = age;
        this.pensionAmount = pensionAmount;
        this.voterId = voterId;
        this.rasanCard = rasanCard;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getPensionAmount() {
        return pensionAmount;
    }

    public void setPensionAmount(Integer pensionAmount) {
        this.pensionAmount = pensionAmount;
    }

    public Integer getVoterId() {
        return voterId;
    }

    public void setVoterId(Integer voterId) {
        this.voterId = voterId;
    }

    public Integer getRasanCard() {
        return rasanCard;
    }

    public void setRasanCard(Integer rasanCard) {
        this.rasanCard = rasanCard;
    }

    @Override
    public String toString() {
        return "OldEmployee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", pesnionAmount=" + pensionAmount +
                ", voterId=" + voterId +
                ", rasanCard=" + rasanCard +
                '}';
    }
}
