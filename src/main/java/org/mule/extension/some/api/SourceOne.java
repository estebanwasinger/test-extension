package org.mule.extension.some.api;

import org.mule.runtime.api.exception.MuleException;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.runtime.operation.Result;
import org.mule.runtime.extension.api.runtime.source.Source;
import org.mule.runtime.extension.api.runtime.source.SourceCallback;

import java.io.Serializable;

public class SourceOne extends Source<String, Serializable> {

    @Connection
    TxConnection conn;

    @Config
    ConfigOne configOne;

    @Override
    public void onStart(SourceCallback<String, Serializable> sourceCallback) throws MuleException {
        System.out.println(conn.getUuid());
        sourceCallback.handle(Result.<String, Serializable>builder().output("").build());
    }

    @Override
    public void onStop() {

    }
}
