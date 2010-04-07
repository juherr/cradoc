package fr.loof.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Le code identifié est suspect.
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface ttention
{
    String value();
}
