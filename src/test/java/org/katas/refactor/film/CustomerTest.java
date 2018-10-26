package org.katas.refactor.film;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;


class CustomerTest {

    @Test
    void should_return_correct_result_when_call_statement() throws Exception {
        Customer customer = new Customer("yangyang");
        Rental rental = new Rental(new Movie("movie1", Movie.CHILDREN), 4);
        Rental rental1 = new Rental(new Movie("movie2", Movie.NEW_RELEASE), 5);
        Rental rental2 = new Rental(new Movie("movie3", Movie.REGULAR), 6);
        customer.addRental(rental);
        customer.addRental(rental1);
        customer.addRental(rental2);

        String expectResult = "Rental Record for yangyang\n\tmovie1\t3.0\n\tmovie2\t15.0\n\tmovie3\t8.0\n" +
                "Amount owed is 26.0\nYou earned 4 frequent renter points";
        assertThat(expectResult, is(customer.statement()));
    }

}