package org.katas.refactor.film;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


class CustomerTest {

    @Test
    void should_return_correct_result_when_call_statement() {
        var customer = new Customer("阳阳");
        customer.addRental(new Rental(new Movie("猫和老鼠", Movie.CHILDREN), 4));
        customer.addRental(new Rental(new Movie("拯救大兵日嗯", Movie.NEW_RELEASE), 5));
        customer.addRental(new Rental(new Movie("魔道祖师", Movie.REGULAR), 6));

        assertThat("Rental Record for 阳阳\n" +
                "\t猫和老鼠\t3.0\n" +
                "\t拯救大兵日嗯\t15.0\n" +
                "\t魔道祖师\t8.0\n" +
                "Amount owed is 26.0\n" +
                "You earned 4 frequent renter points", is(customer.statement()));
    }

}