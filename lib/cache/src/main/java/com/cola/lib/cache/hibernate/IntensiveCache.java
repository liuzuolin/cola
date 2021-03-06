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
package com.cola.lib.cache.hibernate;

import org.hibernate.cache.spi.access.SoftLock;
import org.springframework.cache.Cache;

/**
 * cola
 * Created by jiachen.shi on 8/29/2016.
 */
public interface IntensiveCache extends Cache {

    boolean containsKey(Object key);

    long size();

    public SoftLock lock(Object key);

    public void unlock(Object key, SoftLock lock);

}
