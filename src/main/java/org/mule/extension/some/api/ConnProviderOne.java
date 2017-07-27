package org.mule.extension.some.api;

import static org.mule.runtime.api.connection.ConnectionValidationResult.success;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.values.OfValues;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;

public class ConnProviderOne implements ConnectionProvider<TxConnection> {

    @Parameter
    @Optional(defaultValue = "a value")
    @OfValues(ChannelsProvider.class)
    String channel;

    @Parameter
    @Optional(defaultValue = "a value")
    String required;

    @Override
    public TxConnection connect() throws ConnectionException {
        return new TxConnection(String.valueOf(Math.random()));
    }

    @Override
    public void disconnect(TxConnection s) {

    }

    @Override
    public ConnectionValidationResult validate(TxConnection s) {
        return success();
    }
}
