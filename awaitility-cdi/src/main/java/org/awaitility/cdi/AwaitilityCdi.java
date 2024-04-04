package org.awaitility.cdi;

import org.awaitility.Awaitility;
import org.eclipse.microprofile.context.ManagedExecutor;
import org.eclipse.microprofile.context.ThreadContext;

import java.util.concurrent.ExecutorService;

/**
 * Entry class for the CDI (Context and Dependency Injection) support in Awaitility
 */
public class AwaitilityCdi {

    /**
     * Setup Awaitility to integrate with CDI and Microprofile Context propagation
     */
    public static void setup() {
        ExecutorService executorService = ManagedExecutor.builder().propagated(ThreadContext.CDI).build();
        Awaitility.pollExecutorService(executorService);
    }

}
