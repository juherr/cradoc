package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Y'en a qui aiment le sport !
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface thletique
{
    String value();

    String reviewer() default "";

}
