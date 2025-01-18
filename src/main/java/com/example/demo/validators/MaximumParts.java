package com.example.demo.validators;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = MaximumPartsValidator.class)
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MaximumParts {
    String message() default "The number of parts cannot exceed the maximum number of parts allowed in the inventory.";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
