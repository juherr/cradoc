package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Ca fait mal de lire ça.
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface troce
{
    String value();

    String reviewer() default "";

}
