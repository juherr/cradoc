package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Il serait intéressant de revoir ce bout de code
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface revoir
{
    String value();

    String reviewer() default "";
}
