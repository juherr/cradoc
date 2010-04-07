package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * On va pouvoir vivre avec, mais si quelqu'un pouvait se pencher là dessus SVP...
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface ttendantMieux
{
    String value();

    String reviewer() default "";

}
