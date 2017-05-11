package com.thoughtworks.movierental;

import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {

    @Test
    public void test1() {
        Customer myCust = new Customer("Customer1");
        Movie bahubali = new Movie("Bahubali", Movie.NEW_RELEASE);
        Rental rental1 = new Rental(bahubali, 2);

        myCust.addRental(rental1);


        assertEquals("Rental Record for Customer1\n" +
                "\tBahubali\t6.0\n" +
                "Amount owed is 6.0\n" +
                "You earned 2 frequent renter points", myCust.statement());

    }

    @Test
    public void test2() {
        Customer myCust = new Customer("Customer2");
        Movie bahubali = new Movie("Bahubali", Movie.NEW_RELEASE);
        Rental rental1 = new Rental(bahubali, 2);

        Movie tzp = new Movie("TZP", Movie.CHILDRENS);
        Rental rental2 = new Rental(tzp, 4);

        Movie tzp2 = new Movie("TZP2", Movie.REGULAR);
        Rental rental3 = new Rental(tzp2, 3);

        myCust.addRental(rental1);
        myCust.addRental(rental2);
        myCust.addRental(rental3);

        assertEquals("Rental Record for Customer2\n" +
                "\tBahubali\t6.0\n" +
                "\tTZP\t3.0\n" +
                "\tTZP2\t3.5\n" +
                "Amount owed is 12.5\n" +
                "You earned 4 frequent renter points", myCust.statement());

    }

    @Test
    public void test3() {
        Customer myCust = new Customer("Customer3");
        Movie bahubali = new Movie("Bahubali", Movie.NEW_RELEASE);
        Rental rental1 = new Rental(bahubali, 1);

        Movie tzp = new Movie("TZP", Movie.CHILDRENS);
        Rental rental2 = new Rental(tzp, 4);

        Movie tzp2 = new Movie("TZP2", Movie.REGULAR);
        Rental rental3 = new Rental(tzp2, 3);

        myCust.addRental(rental1);
        myCust.addRental(rental2);
        myCust.addRental(rental3);

        assertEquals("Rental Record for Customer3\n" +
                "\tBahubali\t3.0\n" +
                "\tTZP\t3.0\n" +
                "\tTZP2\t3.5\n" +
                "Amount owed is 9.5\n" +
                "You earned 3 frequent renter points", myCust.statement());

    }


    //regular 2 days,
    @Test
    public void test4() {

        //daysrented 4
        Customer myCust = new Customer("Customer1");
        Movie bahubali = new Movie("Bahubali", Movie.REGULAR);
        Rental rental1 = new Rental(bahubali, 4);

        myCust.addRental(rental1);


        assertEquals("Rental Record for Customer1\n" +
                "\tBahubali\t5.0\n" +
                "Amount owed is 5.0\n" +
                "You earned 1 frequent renter points", myCust.statement());


    }

    @Test
    public void test5() {


        //daysrented 1
        Customer myCust1 = new Customer("Customer1");
        Movie bahubali1 = new Movie("Bahubali", Movie.REGULAR);
        Rental rental2 = new Rental(bahubali1, 1);

        myCust1.addRental(rental2);


        assertEquals("Rental Record for Customer1\n" +
                "\tBahubali\t2.0\n" +
                "Amount owed is 2.0\n" +
                "You earned 1 frequent renter points", myCust1.statement());

    }

    @Test
    public void test6() {


        //daysrented 4
        Customer myCust = new Customer("Customer1");
        Movie bahubali1 = new Movie("Bahubali", Movie.CHILDRENS);
        Rental rental2 = new Rental(bahubali1, 4);

        myCust.addRental(rental2);


        assertEquals("Rental Record for Customer1\n" +
                "\tBahubali\t3.0\n" +
                "Amount owed is 3.0\n" +
                "You earned 1 frequent renter points", myCust.statement());

    }

    @Test
    public void test7() {


        //daysrented 4
        Customer myCust = new Customer("Customer1");
        Movie bahubali = new Movie("Bahubali", Movie.CHILDRENS);
        Rental rental1 = new Rental(bahubali, 1);

        myCust.addRental(rental1);


        assertEquals("Rental Record for Customer1\n" +
                "\tBahubali\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points", myCust.statement());

    }

    //zero rentals
    @Test
    public void test8() {


        //daysrented 4
        Customer myCust = new Customer("Customer1");
        Movie bahubali1 = new Movie("Bahubali", Movie.CHILDRENS);
        //  Rental rental2 = new Rental(bahubali, 0);

        // myCust.addRental(rental1);


        assertEquals("Rental Record for Customer1\n" +
                "Amount owed is 0.0\n" +
                "You earned 0 frequent renter points", myCust.statement());

    }
}