/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.activemq.filter;

import org.apache.activemq.apollo.broker.Destination;


/**
 * Matches messages sent to an exact destination
 *
 * @version $Revision: 1.3 $
 */
public class SimpleDestinationFilter extends DestinationFilter {

    private Destination destination;

    public SimpleDestinationFilter(Destination destination) {
        this.destination = destination;
    }

    public boolean matches(Destination destination) {
        return this.destination.equals(destination);
    }

    public boolean isWildcard() {
        return false;
    }
}
