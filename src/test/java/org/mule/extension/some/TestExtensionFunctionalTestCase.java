package org.mule.extension.some;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.mule.runtime.api.value.Value;
import org.mule.runtime.core.api.construct.Flow;
import org.mule.runtime.module.extension.internal.runtime.ExtensionComponent;
import org.mule.runtime.module.extension.internal.runtime.config.ConfigurationProviderToolingAdapter;
import org.junit.Test;

import java.util.Set;

public class TestExtensionFunctionalTestCase extends MuleArtifactFunctionalTestCase {

    @Override
    protected String getConfigFile() {
        return "test-extension-mule-app.xml";
    }

    @Test
    public void tes3t() throws Exception {
        flowRunner("operationOne").run();
    }

    @Test
    public void getOptions() throws Exception {
        Flow options = (Flow) getFlowConstruct("options");

        ConfigurationProviderToolingAdapter configOne = muleContext.getRegistry().get("configOne");
        Set<Value> valueResolver = configOne.getConnectionValues("channel");
        Set<Value> options1 = configOne.getConfigValues("optionResolver");
        ExtensionComponent processor = (ExtensionComponent) options.getProcessors().get(0);
        Set<Value> channels = processor.getValues("channels");
        assertThat(channels.size(), is(3));
    }


    @Test
    public void test() throws InterruptedException {
        Thread.sleep(1000);
    }
}
