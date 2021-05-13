package com.krazycrave;

import java.time.*;
import com.microsoft.azure.functions.annotation.*;
import com.microsoft.azure.functions.*;

/**
 * Azure Functions with Timer trigger.
 */
public class TimerFunction {
    /**
     * This function will be invoked periodically according to the specified schedule.
     */
    @FunctionName("TimerFunction")
    public void run(
        @TimerTrigger(name = "timerInfo", schedule = "5 * * * * *") String timerInfo,
        final ExecutionContext context
    ) {
        context.getLogger().info("Java Timer trigger function executed at: " + LocalDateTime.now());
    }
}
