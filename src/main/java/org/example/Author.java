package org.example;

public class Author {
    private final String firstName;
    private final String secondName;
    private final String surname;

    public Author(String firstName, String secondName, String surname) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.surname = surname;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurname() {
        return surname;
    }
    @Override
    public String toString() {
        return firstName + " " + secondName + " " + surname;
    }
}
