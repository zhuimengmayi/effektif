/*
 * Copyright 2014 Effektif GmbH.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.effektif.workflow.impl.deprecated.bpmn;

/**
 * Values for the Effektif type attribute used to map BPMN service task elements to Effektif model types, as in the XML:
 * <pre>{@code
 *  <servicetask effektif:type="http"/>
 * }</pre>
 *
 * @author Peter Hilton
 */
public enum ServiceTaskType {
    JAVA, EMAIL, HTTP;

    public boolean hasValue(String value) { return value().equals(value); }

    public String value() { return name().toLowerCase(); }
}