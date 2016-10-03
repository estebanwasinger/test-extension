package org.mule.extension.some.api;

import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;
import org.mule.runtime.extension.api.annotation.Alias;

public class ConnProviderOne implements ConnectionProvider<String> {
    @Override
    public String connect() throws ConnectionException {
        return "Connection";
    }

    @Override
    public void disconnect(String s) {

    }

    @Override
    public ConnectionValidationResult validate(String s) {
        return ConnectionValidationResult.success();
    }
}
