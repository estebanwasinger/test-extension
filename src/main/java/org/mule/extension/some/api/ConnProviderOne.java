package org.mule.extension.some.api;

import static org.mule.runtime.api.connection.ConnectionValidationResult.success;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;

public class ConnProviderOne implements ConnectionProvider<TxConnection> {

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
