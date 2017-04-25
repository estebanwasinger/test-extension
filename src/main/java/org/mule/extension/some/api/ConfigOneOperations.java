package org.mule.extension.some.api;


import static java.lang.String.format;
import static org.mule.extension.some.api.TestExtension.Color.ANSI_GREEN;
import static org.mule.extension.some.api.TestExtension.info;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.runtime.operation.ParameterResolver;
import org.mule.runtime.extension.api.tx.OperationTransactionalAction;

public class ConfigOneOperations {

    public void operationOne(@Content Object payload, OperationTransactionalAction txAction, String transactionalAction, String paramOne, String paramTwo, @UseConfig ConfigOne configOne, @Connection TxConnection connection){
        info(format("=== EXECUTING OPERATION WITH CONNECTION: [%s]", connection.getId()), ANSI_GREEN);
    }

    public void operationDoor(String door,  ParameterResolver<Door> someDoor){
        System.out.println(door +","+  someDoor);
    }
}
