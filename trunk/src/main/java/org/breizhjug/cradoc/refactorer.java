package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Ce bout de code mérite un peu de refactoring
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface refactorer
{
    String value();

    String reviewer() default "";
}
