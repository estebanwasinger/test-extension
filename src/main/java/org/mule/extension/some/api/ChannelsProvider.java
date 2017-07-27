package org.mule.extension.some.api;

import static org.mule.runtime.extension.api.values.ValueBuilder.getValuesFor;
import org.mule.runtime.api.value.Value;
import org.mule.runtime.extension.api.values.ValueProvider;

import java.util.Set;

public class ChannelsProvider implements ValueProvider {

    @Override
    public Set<Value> resolve() {
            return getValuesFor("hola","hi","hello");
    }
}
