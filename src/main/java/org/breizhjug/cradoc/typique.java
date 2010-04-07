package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Tous les goûts sont dans la nature, mais tout de même
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface typique
{
    String value();

    String reviewer() default "";
}
