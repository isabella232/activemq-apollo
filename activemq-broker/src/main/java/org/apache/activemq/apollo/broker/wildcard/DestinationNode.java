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
package org.apache.activemq.apollo.broker.wildcard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;

import org.apache.activemq.protobuf.AsciiBuffer;

/**
 * Represents a node in the {@link DestinationMap} tree
 *
 * @version $Revision: 563921 $
 */
public interface DestinationNode<Value> {
    void appendMatchingValues(Set<Value> answer, ArrayList<AsciiBuffer> paths, int startIndex);

    void appendMatchingWildcards(Set<Value> answer, ArrayList<AsciiBuffer> paths, int startIndex);

    void appendDescendantValues(Set<Value> answer);

    Collection<Value> getDesendentValues();

    DestinationNode<Value> getChild(AsciiBuffer path);

    Collection<Value> getValues();

    Collection<DestinationNode<Value>> getChildren();

    Collection<Value> removeDesendentValues();

    Collection<Value> removeValues();
}
