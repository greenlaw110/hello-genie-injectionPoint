package com.greenlaw110;

import org.osgl.inject.annotation.InjectTag;

import javax.inject.Qualifier;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@InjectTag
@Qualifier
@Retention(RetentionPolicy.RUNTIME)
public @interface Farewell {

    Language language() default Language.EN;

}
