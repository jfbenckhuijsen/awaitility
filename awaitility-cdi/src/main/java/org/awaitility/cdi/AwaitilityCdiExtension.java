package org.awaitility.cdi;

import org.junit.jupiter.api.extension.BeforeEachCallback;
import org.junit.jupiter.api.extension.ExtensionContext;

/**
 * JUnit Jupiter 5 extension to setup Awaitility with CDI.
 */
public class AwaitilityCdiExtension implements BeforeEachCallback {

    @Override
    public void beforeEach(ExtensionContext extensionContext) {
        AwaitilityCdi.setup();
    }
}
