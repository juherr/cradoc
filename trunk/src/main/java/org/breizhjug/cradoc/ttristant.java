package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Bon, va falloir se resaisir là...
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface ttristant
{
    String value();

    String reviewer() default "";

}
