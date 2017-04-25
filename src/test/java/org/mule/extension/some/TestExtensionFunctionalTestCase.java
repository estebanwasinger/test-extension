package org.mule.extension.some;

import org.mule.functional.junit4.MuleArtifactFunctionalTestCase;
import org.mule.runtime.core.api.construct.Flow;

import org.junit.Test;

public class TestExtensionFunctionalTestCase extends MuleArtifactFunctionalTestCase {

//    @Override
//    protected Class<?>[] getAnnotatedExtensionClasses() {
//        return new Class[]{TestExtension.class};
//    }

    @Override
    protected String getConfigFile() {
        return "test-extension-mule-app.xml";
    }

//    @Test
//    public void tes3t() throws Exception {
//startFlow("tx-source-alone");
//Thread.sleep(5000);
//    }
//    @Test
//    public void test2() throws Exception {
//        flowRunner("operationOne").run();
//    }
//
//    @Test
//    public void test() throws InterruptedException {
//        Thread.sleep(1000);
//    }

    @Test
    public void test(){

    }

    private void startFlow(String flowName) throws Exception {
        ((Flow) getFlowConstruct(flowName)).start();
    }
}
