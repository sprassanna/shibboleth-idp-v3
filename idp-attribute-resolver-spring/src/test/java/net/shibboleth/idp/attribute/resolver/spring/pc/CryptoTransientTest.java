/*
 * Licensed to the University Corporation for Advanced Internet Development, 
 * Inc. (UCAID) under one or more contributor license agreements.  See the 
 * NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The UCAID licenses this file to You under the Apache 
 * License, Version 2.0 (the "License"); you may not use this file except in 
 * compliance with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.shibboleth.idp.attribute.resolver.spring.pc;

import net.shibboleth.idp.attribute.resolver.spring.BaseAttributeDefinitionParserTest;
import net.shibboleth.idp.saml.attribute.principalconnector.impl.PrincipalConnector;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * test for crypto principal connector parsers.
 */
public class CryptoTransientTest extends BaseAttributeDefinitionParserTest {

    @Test public void simple() {
        PrincipalConnector connector = getPrincipalConnector("crypto.xml", "sealer.xml");
        
        Assert.assertEquals(connector.getFormat(), "https://example.org/sealer");
    }

}
