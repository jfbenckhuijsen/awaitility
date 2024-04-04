package org.awaitility.cdi;

import org.awaitility.Awaitility;
import org.eclipse.microprofile.context.ManagedExecutor;
import org.eclipse.microprofile.context.ThreadContext;

import java.util.concurrent.ExecutorService;

/**
 * Entry class for the CDI (Context and Dependency Injection) support in Awaitility
 */
public class AwaitilityCdi {

    private static ExecutorService executorService;


    /**
     * Setup Awaitility to integrate with CDI and Microprofile Context propagation
     */
    public static void setup() {
        executorService = ManagedExecutor.builder().propagated(ThreadContext.CDI).build();
        Awaitility.pollExecutorService(executorService);
    }

    /**
     * Teardown the executor service
     */
    public static void tearDown() {
        if (executorService != null) {
            executorService.close();
        }
    }

}
