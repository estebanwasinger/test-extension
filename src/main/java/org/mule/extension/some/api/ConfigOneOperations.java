package org.mule.extension.some.api;


import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.runtime.operation.ParameterResolver;

public class ConfigOneOperations {

    public void operationOne(@Content Object payload, String paramOne, String paramTwo, @UseConfig ConfigOne configOne, @Connection TxConnection connection){
        System.out.println(payload);
        System.out.println(connection.getUuid());
        System.out.println(paramOne +","+ paramTwo);
    }

    public void operationDoor(String door,  ParameterResolver<Door> someDoor){
        System.out.println(door +","+  someDoor);
    }
}
