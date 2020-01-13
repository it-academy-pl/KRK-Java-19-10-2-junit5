package pl.itacademy;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.assertThrows;

class AlcoholTest {

    @Test
    public void isEmpty_afterInitializationReturnsTrue() {
        Alcohol beer = new Alcohol("Pzeniczne");
        assertThat(beer.isEmpty(), equalTo(true));
    }

    @Test
    public void fillUp_afterFillingUpIsEmptyReturnsFalse() {
        Alcohol beer = new Alcohol("Ciemne");
        beer.feelUp();
        assertThat(beer.isEmpty(), equalTo(false));
    }

    @Test
    public void drink_whenAlcoholEmpty_throwsEmptyAlcoholException() {
        Alcohol beer = new Alcohol("Ciemne");
        EmptyAlcoholException exception = assertThrows(EmptyAlcoholException.class, () -> beer.drink());
        assertThat(exception.getMessage(), equalTo("Alcohol Ciemne is empty"));
    }

}