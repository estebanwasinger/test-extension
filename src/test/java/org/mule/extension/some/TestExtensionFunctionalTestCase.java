package org.mule.extension.some;

import org.junit.Test;
import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;

public class TestExtensionFunctionalTestCase extends MuleArtifactFunctionalTestCase {

//    @Override
//    protected Class<?>[] getAnnotatedExtensionClasses() {
//        return new Class[]{TestExtension.class};
//    }

    @Override
    protected String getConfigFile() {
        return "test-extension-mule-app.xml";
    }

    @Test
    public void tes3t() throws Exception {
        flowRunner("operationOne").run();
    }
//    @Test
//    public void test2() throws Exception {
//        flowRunner("doorOperation").run();
//    }

    @Test
    public void test() throws InterruptedException {
        Thread.sleep(1000);
    }
}
