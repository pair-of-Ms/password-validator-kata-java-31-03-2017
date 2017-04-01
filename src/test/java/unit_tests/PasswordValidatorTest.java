package unit_tests;

import org.junit.Test;
import passwords.PasswordValidator;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class PasswordValidatorTest {

    @Test
    public void invalid_password_because_it_lacks_an_underscore() {
        assertThat(PasswordValidator.isValid("1Aa222222"), is(false));
    }

    @Test
    public void valid_password() {
        assertThat(PasswordValidator.isValid("1Aa______"), is(true));
    }

    @Test
    public void invalid_password_because_it_lacks_a_number() {
        assertThat(PasswordValidator.isValid("aA_______"), is(false));
    }

    @Test
    public void invalid_password_because_it_lacks_a_lowercase() {
        assertThat(PasswordValidator.isValid("A1________"), is(false));
    }

    @Test
    public void invalid_password_because_it_lacks_an_uppercase() {
        assertThat(PasswordValidator.isValid("a1________"), is(false));
    }

    @Test
    public void invalid_password_because_it_is_too_short() {
        assertThat(PasswordValidator.isValid("a1A_____"), is(false));
    }

}
