package com.pix.chavepix.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
@Constraint(validatedBy = NotEmptyValidation.class)
public @interface NotEmptyClass {

    String message() default "ALista não pode ser vazia.";
//    Class<?>[] groups() default {};
//    Class<? extends Payload>[] payload() default {};
}
