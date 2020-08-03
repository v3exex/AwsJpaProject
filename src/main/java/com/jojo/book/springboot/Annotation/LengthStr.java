package com.jojo.book.springboot.Annotation;

import com.jojo.book.springboot.Validator.StrValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Constraint(validatedBy = StrValidator.class)
@Target( { ElementType.FIELD, ElementType.METHOD } )
@Retention(RetentionPolicy.RUNTIME)
public @interface LengthStr {
    String message() default "default message";
    int length() default 0;

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
