package org.mule.extension.some.api;

import org.mule.runtime.api.exception.MuleException;
import org.mule.runtime.api.message.Attributes;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.runtime.operation.Result;
import org.mule.runtime.extension.api.runtime.source.Source;
import org.mule.runtime.extension.api.runtime.source.SourceCallback;

public class SourceOne extends Source<String, Attributes> {

    @Connection
    String conn;

    @UseConfig
    ConfigOne configOne;

    @Override
    public void onStart(SourceCallback<String, Attributes> sourceCallback) throws MuleException {
        sourceCallback.handle(Result.<String, Attributes>builder().output("").build());
    }

    @Override
    public void onStop() {

    }
}
