package CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static CombinatorPattern.CustomerRegisterationValidator.*;
import static CombinatorPattern.CustomerRegisterationValidator.ValidationResult.*;

//EXAMPLE OF COMBINATOR PATTERN
public interface CustomerRegisterationValidator extends Function<Customer, ValidationResult> {

    static CustomerRegisterationValidator isEmailValid(){
        return customer -> customer.getEmail().contains("@")?
                       SUCCESS: EMAIL_NOT_VALID;
    }
    static CustomerRegisterationValidator isPhoneNumberValid(){
        return customer -> customer.getPhoneNumber().startsWith("+0") ?
                SUCCESS: PHONE_NUMBER_NOT_VALID;
    }

    static CustomerRegisterationValidator isAnAdult(){
        return customer -> Period.between(customer.getDob(),
                LocalDate.now()).getYears() > 16? SUCCESS: IS_NOT_AN_ADULT;
    }

    default CustomerRegisterationValidator and (CustomerRegisterationValidator other){
        return customer -> {
            ValidationResult result = this.apply(customer);
            return  result.equals(SUCCESS)? other.apply(customer): result;
        };
    }

    enum ValidationResult{
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_AN_ADULT
    }
}
