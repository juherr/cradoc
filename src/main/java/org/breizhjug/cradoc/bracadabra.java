package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Par quel miracle est-ce que ce code est sensé fonctionner ?
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface bracadabra
{
    String value();

    String reviewer() default "";
}
