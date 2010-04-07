package org.breizhjug.cradoc;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Je ne suis pas très sûr de mon coup, est-ce que quelqu'un pourrait me relire SVP ?
 */
@Retention( RetentionPolicy.SOURCE )
@Documented
public @interface relire
{
    String developper();
}
