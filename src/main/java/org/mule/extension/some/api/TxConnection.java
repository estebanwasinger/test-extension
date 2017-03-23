package org.mule.extension.some.api;

import org.mule.runtime.extension.api.connectivity.TransactionalConnection;

public class TxConnection implements TransactionalConnection {

    public String getUuid() {
        return uuid;
    }

    private String uuid;

    public TxConnection(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public void begin() throws Exception {
        System.out.println("BEGIN");
    }

    @Override
    public void commit() throws Exception {
        System.out.println("COMMIT");

    }

    @Override
    public void rollback() throws Exception {
        System.out.println("ROLLBACK");

    }
}
