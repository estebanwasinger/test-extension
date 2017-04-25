package org.mule.extension.some.api;

import static java.lang.String.format;
import static org.mule.extension.some.api.TestExtension.Color.ANSI_GREEN;
import static org.mule.extension.some.api.TestExtension.Color.ANSI_YELLOW;
import static org.mule.extension.some.api.TestExtension.info;
import org.mule.runtime.api.exception.MuleException;
import org.mule.runtime.api.message.Attributes;
import org.mule.runtime.extension.api.annotation.execution.OnError;
import org.mule.runtime.extension.api.annotation.execution.OnSuccess;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.ParameterGroup;
import org.mule.runtime.extension.api.runtime.operation.Result;
import org.mule.runtime.extension.api.runtime.source.Source;
import org.mule.runtime.extension.api.runtime.source.SourceCallback;

public class SourceOne extends Source<String, Attributes> {

    @Connection
    TxConnection connection;

    @Config
    ConfigOne configOne;

    @ParameterGroup(name = "TXGroup")
    public SomePojo somePojo;


    @Override
    public void onStart(SourceCallback<String, Attributes> sourceCallback) throws MuleException {
        info("======= STARTING SOURCE ======", ANSI_YELLOW);
        info(format("=== DISPATCHING MESSAGE WITH CONNECTION [%s]", connection.getId()), ANSI_GREEN);
        sourceCallback.handle(Result.<String, Attributes>builder().output("").build());
    }

    @Override
    public void onStop() {
        info("======= STOPPING SOURCE ======", ANSI_YELLOW);
    }

    @OnSuccess
    public void onSuccess(){
        info(format("=== SOURCE SUCCESS EXECUTION == [%s]", connection.getId()), ANSI_GREEN);
    }

    @OnError
    public void onError(){
        info(format("=== SOURCE ERROR EXECUTION == [%s]", connection.getId()), ANSI_GREEN);
    }
}
