package org.mule.extension.some.api;

import static org.mule.runtime.api.connection.ConnectionValidationResult.success;
import org.mule.runtime.api.connection.ConnectionException;
import org.mule.runtime.api.connection.ConnectionProvider;
import org.mule.runtime.api.connection.ConnectionValidationResult;

import java.util.Random;

public class ConnProviderOne implements ConnectionProvider<TxConnection> {

    @Override
    public TxConnection connect() throws ConnectionException {
        return new TxConnection(String.valueOf(new Random().ints(0,100).iterator().next()));
    }

    @Override
    public void disconnect(TxConnection s) {

    }

    @Override
    public ConnectionValidationResult validate(TxConnection s) {
        return success();
    }
}
