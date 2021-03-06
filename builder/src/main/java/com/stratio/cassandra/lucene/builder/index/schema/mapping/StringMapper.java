/*
 * Copyright (C) 2014 Stratio (http://stratio.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.stratio.cassandra.lucene.builder.index.schema.mapping;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A {@link Mapper} to map a string, not tokenized field.
 *
 * @author Andres de la Pena {@literal <adelapena@stratio.com>}
 */
public class StringMapper extends SingleColumnMapper<StringMapper> {

    /** If the mapping must be case sensitive. */
    @JsonProperty("case_sensitive")
    Boolean caseSensitive;

    /**
     * Sets if the mapping must be case sensitive.
     *
     * @param caseSensitive if the mapping must be case sensitive
     * @return this with the specified casing option
     */
    public StringMapper caseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }
}
