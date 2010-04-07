package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Ce bout de code mérite d'être documenté
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface documenter
{
    String value();

    String reviewer() default "";
}
