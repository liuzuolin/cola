/*
 * Copyright 2002-${Year} the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.cola.libs.jpa.test;

import com.cola.libs.cache.annotatiion.EnableRedisCache;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * cola
 * Created by jiachen.shi on 7/18/2016.
 */
@Configuration
@PropertySource("classpath:druid.properties")
@EnableAutoConfiguration
@EnableRedisCache
@EntityScan(basePackages = {"com.cola.libs.jpa.entity"})
public class TestConfiguration {

    @Bean
    public OptimisticLockingFailueTest optimisticLockingFailueTest(){
        return new OptimisticLockingFailueTest();
    }

    @Bean
    public LazyLoadingTest lazyLoadingTest(){
        return new LazyLoadingTest();
    }

}
