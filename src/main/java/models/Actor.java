package models;

public class Actor extends Person {

    @Override
    public String toString() {
        return "actor " + firstName + " " + lastName;
    }
}
