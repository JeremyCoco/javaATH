package com.example.demo;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PersonalInformation {

    @NotNull
    @Size(min = 3, max = 10)
    private String name;

    @NotNull
    @Size(min = 3, max = 30)
    private String surname;

    @NotNull
    @Min(18)
    private Integer age;

    @NotNull
    @Digits(integer = 16, fraction = 0)
    private Integer bankNumber;

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(Integer bankNumber) {
        this.bankNumber = bankNumber;
    }

    public String toString() {
        return "Person(Name: " + this.name + ", Age: " + this.age + ")";
    }
}