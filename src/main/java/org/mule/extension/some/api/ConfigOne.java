package org.mule.extension.some.api;

import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Parameter;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.runtime.operation.ParameterResolver;

@Operations(ConfigOneOperations.class)
public class ConfigOne {

    @Parameter
    @Optional
    String configOne;

}
