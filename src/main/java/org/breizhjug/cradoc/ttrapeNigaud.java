package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Dans le mille :P
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface ttrapeNigaud
{
    String value();

    String reviewer() default "";

}
