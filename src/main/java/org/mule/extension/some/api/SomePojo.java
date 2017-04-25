package org.mule.extension.some.api;

import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.annotation.param.Parameter;
import org.mule.runtime.extension.api.tx.SourceTransactionalAction;

public class SomePojo {

    @Parameter
    SourceTransactionalAction txAction;

    @Parameter
    @Optional
    String param;
}
