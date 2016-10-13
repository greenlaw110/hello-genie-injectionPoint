package com.greenlaw110;

import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.InitializationError;
import org.osgl.inject.Genie;

public class GenieRunner extends BlockJUnit4ClassRunner {

    private Genie genie;

    @Override
    protected Object createTest() throws Exception {
        return genie.get(super.createTest().getClass());
    }

    public GenieRunner(Class<?> klass) throws InitializationError {
        super(klass);
        genie = Genie.create(MyBeanConfig.class);
        genie.supportInjectionPoint(true);
    }
}
