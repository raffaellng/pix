package com.pix.chavepix.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

public class NotEmptyValidation implements ConstraintValidator<NotEmptyClass, List> {

    @Override
    public boolean isValid(List list, ConstraintValidatorContext constraintValidatorContext) {
        return list != null && !list.isEmpty();
    }

    @Override
    public void initialize(NotEmptyClass constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }
}
