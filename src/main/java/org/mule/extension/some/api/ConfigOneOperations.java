package org.mule.extension.some.api;


import org.mule.runtime.extension.api.annotation.values.OfValues;
import org.mule.runtime.extension.api.annotation.param.Config;
import org.mule.runtime.extension.api.annotation.param.Connection;
import org.mule.runtime.extension.api.annotation.param.Content;
import org.mule.runtime.extension.api.annotation.param.Optional;
import org.mule.runtime.extension.api.runtime.parameter.ParameterResolver;

public class ConfigOneOperations {

    public void operationOne(@Content Object payload, String paramOne, String paramTwo, @Config ConfigOne configOne, @Connection TxConnection connection){
        System.out.println(payload);
        System.out.println(connection.getUuid());
        System.out.println(paramOne +","+ paramTwo);
    }

    public void operationDoor(String door,  ParameterResolver<Door> someDoor){
        System.out.println(door +","+  someDoor);
    }

    public void operationWithOptions(@Optional String other, int integer, @OfValues(ChannelsProvider.class) String channels, @Connection TxConnection connection){

    }
}
