package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Ce bout de code ne mérite pas d'exister, il doit être supprimé
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface supprimer
{
    String value();

    String reviewer() default "";
}
