package io.harmed.spring.mvc.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
/*@Constraint annotation необходима для указания класса,
где мы пропишем основную бизнесс-логику валидации поля*/
@Constraint(validatedBy = CheckEmailValidator.class)
public @interface CheckEmail {
    public String value() default "xyz.com";
    public String message() default "email must end with xyz.com";

    /*создаем два массива
    * groups позволяет разбивать аннотации по группам
    * payLoad используется для переноса информации о метаданных клиентов*/

    public Class<?>[] groups() default {};
    public Class<? extends Payload>[] payload() default {};
}
