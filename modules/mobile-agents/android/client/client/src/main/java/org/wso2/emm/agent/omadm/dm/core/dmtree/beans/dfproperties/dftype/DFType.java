/*
 * Copyright (c) 2016, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.emm.agent.omadm.dm.core.dmtree.beans.dfproperties.dftype;

import org.simpleframework.xml.Element;
import org.simpleframework.xml.ElementUnion;
import org.simpleframework.xml.Root;
import org.wso2.emm.agent.omadm.dm.core.dmtree.beans.type.AbstractTypeProperty;
import org.wso2.emm.agent.omadm.dm.core.dmtree.beans.type.DDFName;
import org.wso2.emm.agent.omadm.dm.core.dmtree.beans.type.MIME;

import javax.xml.bind.annotation.*;

/**
 * The 'DFType' property of the 'DFProperties' property
 */
@Root(name = "DFType")
public class DFType {

    @ElementUnion({
            @Element(name = "MIME", required = true, type = MIME.class),
            @Element(name = "DDFName", required = true, type = DDFName.class)
    })

    private AbstractTypeProperty dfType;

    public AbstractTypeProperty getDfType() {
        return dfType;
    }

    public void setDfType(AbstractTypeProperty dfType) {
        this.dfType = dfType;
    }
}
