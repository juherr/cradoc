package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Sur ce coup là, chapeau bas monseigneur...
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface dmiratif
{
    String value();

    String reviewer() default "";
}
