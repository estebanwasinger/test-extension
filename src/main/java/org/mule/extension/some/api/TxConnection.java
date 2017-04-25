package org.mule.extension.some.api;

import static java.lang.String.format;
import static org.mule.extension.some.api.TestExtension.Color.ANSI_RED;
import static org.mule.extension.some.api.TestExtension.info;
import org.mule.runtime.extension.api.connectivity.TransactionalConnection;

public class TxConnection implements TransactionalConnection {

    private String id;

    public TxConnection(String id) {
        this.id = id;
    }

    @Override
    public void begin() throws Exception {
        info(format("=== BEGINNING TRANSACTION === CONNECTION ID: [%s]", id), ANSI_RED);
    }

    @Override
    public void commit() throws Exception {
        info(format("=== COMMITTING TRANSACTION === CONNECTION ID: [%s]", id), ANSI_RED);
    }

    @Override
    public void rollback() throws Exception {
        info(format("=== ROLLBACKING TRANSACTION === CONNECTION ID: [%s]", id), ANSI_RED);
    }

    public String getId() {
        return id;
    }
}
