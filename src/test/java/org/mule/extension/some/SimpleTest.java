package org.mule.extension.some;

import com.google.common.base.CaseFormat;

import org.junit.Test;

/**
 * Created by estebanwasinger on 9/23/16.
 */
public class SimpleTest {

    @Test
    public void test(){
        final String to = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_HYPHEN, "Other Name");
        System.out.println(to);
    }

}
