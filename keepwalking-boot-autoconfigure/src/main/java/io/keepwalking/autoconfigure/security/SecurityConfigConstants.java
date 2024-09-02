/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.keepwalking.autoconfigure.security;

/**
 * SecurityConfigConstants
 *
 * @author <a href="mailto:taofangf@gmail.com">Fangtao<a/>
 * @since 2024.08
 */
public interface SecurityConfigConstants {
    /**
     * security config prefix
     */
    String PROPERTY_NAME_PREFIX = "keepwalking.security";

    /**
     * web security config prefix
     */
    String WEB_SECURITY_PROPERTY_NAME_PREFIX = PROPERTY_NAME_PREFIX + ".web";

    /**
     * web security filter orders config prefix
     */
    String WEB_SECURITY_FILTERS_PROPERTY_NAME_PREFIX = PROPERTY_NAME_PREFIX + ".web.filters";

    /**
     * RemoteIpFilter config prefix
     */
    String WEB_SECURITY_REMOTE_IP_PROPERTY_NAME_PREFIX = WEB_SECURITY_PROPERTY_NAME_PREFIX + ".remote-ip";

    /**
     * RemoteAddrFilter config prefix
     */
    String WEB_SECURITY_REMOTE_ADDR_PROPERTY_NAME_PREFIX = WEB_SECURITY_PROPERTY_NAME_PREFIX + ".remote-addr";

    /**
     * CorsFilter config prefix
     */
    String WEB_SECURITY_CORS_PROPERTY_NAME_PREFIX = WEB_SECURITY_PROPERTY_NAME_PREFIX + ".cors";

    /**
     * RateLimitFilter config prefix
     */
    String WEB_SECURITY_RATE_LIMIT_PROPERTY_NAME_PREFIX = WEB_SECURITY_PROPERTY_NAME_PREFIX + ".rate-limit";

    /**
     * HttpHeaderSecurityFilter config prefix
     */
    String WEB_SECURITY_HTTP_HEADER_PROPERTY_NAME_PREFIX = WEB_SECURITY_PROPERTY_NAME_PREFIX + ".http-header";
}