package com.aginskiy.training.entity;

import java.util.Objects;

public class Author {
    private String name;
    private int age;
    private String country;

    public Author() {

    }

    public Author(String name, int age, String country) {
        this.name = name;
        this.age = age;
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return age == author.age &&
                Objects.equals(name, author.name) &&
                Objects.equals(country, author.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, country);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Author{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
