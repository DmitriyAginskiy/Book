package com.aginskiy.training.entity;

import java.util.Objects;

public class Publisher {
    private String name;
    private String director;

    public Publisher() {

    }

    public Publisher(String name, String director) {
        this.name = name;
        this.director = director;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Publisher publisher = (Publisher) o;
        return Objects.equals(name, publisher.name) &&
                Objects.equals(director, publisher.director);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, director);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Publisher{");
        sb.append("name='").append(name).append('\'');
        sb.append(", director='").append(director).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
