package com.cola.libs.cache.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * cola
 * Created by jiachen.shi on 8/17/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
@Documented
public @interface CacheEvict {

    String value() default "";
    String[] keys() default {};
    String keysGenerator() default "";
    String cacheManager() default "";
    String condition() default "";
    boolean beforeInvocation() default false;

}
