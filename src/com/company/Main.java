// David Semchishin
// 3/14/2023

package com.company;

public class Main {

    public static void main(String[] args) {
        Email email1 = new Email("Garfield","GarfieldLovesLasagna@gmail.com");
        Call call1 = new Call("Garfield","123-123-1234");

        email1.contact();
        call1.contact();
    }
}


abstract class Contact{
    private String name;

    public Contact(String name) {
        this.name = name;
    }

    abstract void contact();
}



class Email extends Contact{
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    void contact() {
        System.out.println("Emailing " + email);
    }
}

class Call extends Contact{
    private String phoneNumber;

    public Call(String name, String phoneNumber) {
        super(name);
        this.phoneNumber = phoneNumber;
    }

    @Override
    void contact() {
        System.out.println("Calling " + phoneNumber);
    }
}

