package com.mycompany.core.cdiextn;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.TYPE;


/**
 * CDI annotation for eager application scoped beans.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE})
public @interface Eager
{
}
