package org.mule.extension.some.api;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.dsl.xml.XmlHints;
import org.mule.runtime.extension.api.annotation.param.Parameter;

@XmlHints(allowTopLevelDefinition = true)
@Alias("someDoor")
public class Door {

    @Parameter
    String paramOne;

    @Parameter
    String paramTwo;

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("paramOne", paramOne)
                .append("paramTwo", paramTwo)
                .toString();
    }

    public String getParamOne() {
        return paramOne;
    }

    public String getParamTwo() {
        return paramTwo;
    }
}
