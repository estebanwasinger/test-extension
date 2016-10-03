package org.mule.extension.some.api;


import org.mule.runtime.extension.api.annotation.ParameterGroup;
import org.mule.runtime.extension.api.annotation.param.UseConfig;
import org.mule.runtime.extension.api.runtime.operation.ParameterResolver;

public class ConfigOneOperations {

    public void operationOne(String paramOne, String paramTwo, @UseConfig ConfigOne configOne){
        System.out.println(paramOne +","+ paramTwo);
    }

    public void operationDoor(String door,  ParameterResolver<Door> someDoor){
        System.out.println(door +","+  someDoor);
    }
}
