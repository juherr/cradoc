package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Ce bout de code mérite d'être mis en commun
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface mettreEnCommun
{
    String value();

    String reviewer() default "";
}
