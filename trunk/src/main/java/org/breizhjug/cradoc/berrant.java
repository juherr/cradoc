package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Quelque'un a vraiment demmandé ça ?
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface berrant
{
    String value();

    String reviewer() default "";
}
