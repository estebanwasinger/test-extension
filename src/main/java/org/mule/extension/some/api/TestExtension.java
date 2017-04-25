package org.mule.extension.some.api;

import static org.slf4j.LoggerFactory.getLogger;
import org.mule.runtime.api.meta.Category;
import org.mule.runtime.extension.api.annotation.Configurations;
import org.mule.runtime.extension.api.annotation.Export;
import org.mule.runtime.extension.api.annotation.Extension;
import org.mule.runtime.extension.api.annotation.connectivity.ConnectionProviders;
import org.mule.runtime.extension.api.annotation.dsl.xml.Xml;

import org.slf4j.Logger;

@Extension(name = "Test Extension", vendor = "MuleSoft Inc.", category = Category.SELECT)
@Configurations({ConfigOne.class})
@ConnectionProviders(ConnProviderOne.class)
@Export(classes = ConfigOne.class)
@Xml(prefix = "tx-ext")
public class TestExtension {

    public enum Color {
        ANSI_RESET("\u001B[0m"),
        ANSI_BLACK("\u001B[30m"),
        ANSI_RED("\u001B[31m"),
        ANSI_GREEN("\u001B[32m"),
        ANSI_YELLOW("\u001B[33m"),
        ANSI_BLUE("\u001B[34m"),
        ANSI_PURPLE("\u001B[35m"),
        ANSI_CYAN("\u001B[36m"),
        ANSI_WHITE("\u001B[37m");

        private String color;

        Color(String color){

            this.color = color;
        }

        public String getColor(){
            return this.color;
        }
    }

    public static final Logger LOGGER = getLogger(TestExtension.class);

    public static void info(String text, Color color){
        LOGGER.info(color.getColor() + text + Color.ANSI_RESET.getColor());
    }
}
