package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * regarde bien, mais alors bien, ce que tu as écrit.
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface toll
{
    String value();

    String reviewer() default "";

}
