package org.mule.extension.some.api;

import org.mule.runtime.core.api.Event;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

import java.util.function.Function;

@Operations(ConfigOneOperations.class)
public class ConfigOne {

    @Parameter
    @Optional
    String configOne;

    @Parameter
    @Optional
    Function<Event, String> someString;

}
