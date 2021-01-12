package io.harmed.spring.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CheckEmailValidator implements ConstraintValidator<CheckEmail, String> {
    private String endOfEmail;

    @Override
    public void initialize(CheckEmail checkEmail) {
        endOfEmail = checkEmail.value();
    }

    @Override
    public boolean isValid(String inputValue, ConstraintValidatorContext constraintValidatorContext) {
        /*проверяем, заканчивается ли email на endOfEmail*/
        return inputValue.endsWith(endOfEmail);
    }
}
