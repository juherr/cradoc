package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Se passe de commentaire ...
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface tterant
{
    String value();

    String reviewer() default "";

}
