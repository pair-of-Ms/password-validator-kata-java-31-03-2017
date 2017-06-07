package unit_tests;

import org.junit.Test;
import passwordValidation.PasswordValidator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PasswordValidatorTest {
    @Test
    public void shouldContainLowerCase() {
        assertThat(PasswordValidator.isValid("ABC_12345"), is(false));
    }

    @Test
    public void validPassword() {
        assertThat(PasswordValidator.isValid("Pass_Wor1"), is(true));
    }

    @Test
    public void shouldContainMoreThanEightCharacters() {
        assertThat(PasswordValidator.isValid("A1_b2345"), is(false));
    }

    @Test
    public void shouldContainUpperCase() {
        assertThat(PasswordValidator.isValid("abc_12345"), is(false));
    }

    @Test
    public void shouldContainANumber() {
        assertThat(PasswordValidator.isValid("abc_efghI"), is(false));
    }

    @Test
    public void shouldContainUnderscore() {
        assertThat(PasswordValidator.isValid("abc4efghI"), is(false));
    }


}
