package com.jojo.book.springboot.Validator;

import com.jojo.book.springboot.Annotation.LengthStr;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.text.MessageFormat;

@Component
@RequiredArgsConstructor
public class StrValidator implements ConstraintValidator<LengthStr, String> {

    private final int maxLength = 10;

    @Override
    public void initialize(LengthStr constraintAnnotation) {}

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {

        if (value.length() > maxLength) {
            context.buildConstraintViolationWithTemplate(
                    MessageFormat.format("String {0} Length is limit over", value))
                    .addConstraintViolation();
            return false;
        }
        return true;
    }
}
