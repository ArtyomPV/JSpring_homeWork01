package ru.gb;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.util.Objects;

public class Person {
    //region Private Fields
    private final String firstName, lastName;
    private final int age;
    //endregion

    //region Constructor
    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }
    //endregion

    //region Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    //endregion


    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("Person")
                .append("firstName", firstName)
                .append("lastName", lastName)
                .append("age", age)
                .toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return new EqualsBuilder()
                .append(age, person.age)
                .append(firstName, person.firstName)
                .append(lastName, person.lastName)
                .isEquals();
                }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(age)
                .append(firstName)
                .append(lastName)
                .toHashCode();


    }
}
