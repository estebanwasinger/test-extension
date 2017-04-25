package org.mule.extension.some.api;

import org.mule.runtime.api.exception.MuleException;
import org.mule.runtime.api.message.Attributes;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.runtime.operation.Result;
import org.mule.runtime.extension.api.runtime.source.Source;
import org.mule.runtime.extension.api.runtime.source.SourceCallback;

public class SourceOne extends Source<String, Attributes> {

    @Connection
    TxConnection conn;

    @Config
    ConfigOne configOne;

    @Override
    public void onStart(SourceCallback<String, Attributes> sourceCallback) throws MuleException {
        System.out.println(conn.getUuid());
        sourceCallback.handle(Result.<String, Attributes>builder().output("").build());
    }

    @Override
    public void onStop() {

    }
}
