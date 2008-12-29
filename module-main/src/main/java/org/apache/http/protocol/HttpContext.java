/*
 * $HeadURL$
 * $Revision$
 * $Date$
 *
 * ====================================================================
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation.  For more
 * information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 *
 */

package org.apache.http.protocol;

import java.util.HashMap;

/**
 * HttpCotext represents execution state of an HTTP process. It is a structure 
 * that can be used to map an attribute name to an attribute value. Internally 
 * HTTP context implementations are usually backed by a {@link HashMap}. 
 * <p>
 * The primary purpose of the HTTP context is to facilitate information sharing 
 * among various  logically related components. HTTP context can be used 
 * to store a processing state for one message or several consecutive messages. 
 * Multiple logically related messages can participate in a logical session 
 * if the same context is reused between consecutive messages.
 * 
 * @author <a href="mailto:oleg at ural.ru">Oleg Kalnichevski</a>
 *
 * @version $Revision$
 * 
 * @since 4.0
 */
public interface HttpContext {

    /** The prefix reserved for use by HTTP components. "http." */
    public static final String RESERVED_PREFIX  = "http.";
    
    /**
     * Obtains attribute with the given name.
     * 
     * @param id the attribute name.
     * @return attribute value, or <code>null</code> if not set.
     */
    Object getAttribute(String id);

    /**
     * Sets value of the attribute with the given name.
     * 
     * @param id the attribute name.
     * @param obj the attribute value.
     */
    void setAttribute(String id, Object obj);

    /**
     * Removes attribute with the given name from the context.
     * 
     * @param id the attribute name.
     * @return attribute value, or <code>null</code> if not set.
     */
    Object removeAttribute(String id);
    
}
