package org.example.creational.builder;

public class Person {

    private String lastName;
    private String firstName;
    private int age;

    public Person(Builder builder){
        lastName= builder.lastName;
        firstName = builder.firstName;
        age = builder.age;
    }



    public static class Builder {
        private String lastName;
        private String firstName;
        private int age;

        public Builder lastName(String lastName){
            this.lastName=lastName;
            return this;

        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;

        }

        public Builder age(int age){
            this.age=age;
            return this;
        }

        public Person build(){
            return new Person(this);
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", age=" + age +
                '}';
    }
}
