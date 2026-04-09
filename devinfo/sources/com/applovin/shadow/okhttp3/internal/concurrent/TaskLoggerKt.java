package com.applovin.shadow.okhttp3.internal.concurrent;

import com.applovin.shadow.okhttp3.internal.http2.Http2Connection;
import java.util.Arrays;
import java.util.logging.Level;
import je.u;
import mk.a;
import nk.k;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class TaskLoggerKt {
    public static final String formatDuration(long j) {
        return String.format("%6s", Arrays.copyOf(new Object[]{j <= -999500000 ? u.s((j - 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ", new StringBuilder()) : j <= -999500 ? u.s((j - 500000) / 1000000, " ms", new StringBuilder()) : j <= 0 ? u.s((j - 500) / 1000, " µs", new StringBuilder()) : j < 999500 ? u.s((j + 500) / 1000, " µs", new StringBuilder()) : j < 999500000 ? u.s((j + 500000) / 1000000, " ms", new StringBuilder()) : u.s((j + 500000000) / Http2Connection.DEGRADED_PONG_TIMEOUT_NS, " s ", new StringBuilder())}, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        TaskRunner.Companion.getLogger().fine(taskQueue.getName$okhttp() + ' ' + String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1)) + ": " + task.getName());
    }

    public static final <T> T logElapsed(Task task, TaskQueue taskQueue, a aVar) {
        long jNanoTime;
        k.e(task, "task");
        k.e(taskQueue, "queue");
        k.e(aVar, "block");
        boolean zIsLoggable = TaskRunner.Companion.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = taskQueue.getTaskRunner$okhttp().getBackend().nanoTime();
            log(task, taskQueue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T t10 = (T) aVar.invoke();
            if (zIsLoggable) {
                log(task, taskQueue, "finished run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            return t10;
        } catch (Throwable th2) {
            if (zIsLoggable) {
                log(task, taskQueue, "failed a run in " + formatDuration(taskQueue.getTaskRunner$okhttp().getBackend().nanoTime() - jNanoTime));
            }
            throw th2;
        }
    }

    public static final void taskLog(Task task, TaskQueue taskQueue, a aVar) {
        k.e(task, "task");
        k.e(taskQueue, "queue");
        k.e(aVar, "messageBlock");
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            log(task, taskQueue, (String) aVar.invoke());
        }
    }
}
