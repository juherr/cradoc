package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Dans un monde de bisounours, ça marcherait sans doute.
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface ttendrissant
{
    String value();

    String reviewer() default "";

}
