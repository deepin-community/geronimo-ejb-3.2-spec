/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

//
// This source code implements specifications defined by the Java
// Community Process. In order to remain compliant with the specification
// DO NOT add / change / or delete method signatures!
//

package javax.ejb;

import javax.xml.rpc.handler.MessageContext;
import java.util.Map;

/**
 * @version $Rev: 881904 $ $Date: 2009-11-18 20:58:29 +0100 (mer. 18 nov. 2009) $
 */
public interface SessionContext extends EJBContext {
    EJBLocalObject getEJBLocalObject() throws IllegalStateException;

    EJBObject getEJBObject() throws IllegalStateException;

    MessageContext getMessageContext() throws IllegalStateException;

    <T> T getBusinessObject(Class<T> businessInterface);

    Class getInvokedBusinessInterface();

    boolean wasCancelCalled();
}
