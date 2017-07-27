package org.mule.extension.some.api;

import org.mule.runtime.core.api.Event;
import org.mule.runtime.extension.api.annotation.Alias;
import org.mule.runtime.extension.api.annotation.Operations;
import org.mule.runtime.extension.api.annotation.Sources;
import org.mule.runtime.extension.api.annotation.values.OfValues;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

import java.util.function.Function;

@Operations(ConfigOneOperations.class)
@Sources(SourceOne.class)
public class ConfigOne {

    @Parameter
    @Optional
    @Alias("configTwo")
    String configOne;

    @Parameter
    @Optional
    Function<Event, String> someString;

    @Parameter
    @Optional
    @OfValues(ChannelsProvider.class)
    String optionResolver;

}
