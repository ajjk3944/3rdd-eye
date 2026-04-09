package com.applovin.shadow.okhttp3.internal.concurrent;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.services.core.network.core.OkHttp3Client;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.n;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.w;
import l9.a;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\u001a1\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a'\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a7\u0010\u0013\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0015"}, d2 = {"Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;", "task", "Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;", "queue", "Lkotlin/Function0;", "", "messageBlock", "Ly8/s;", "taskLog", "(Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;Ll9/a;)V", PglCryptUtils.KEY_MESSAGE, "log", "(Lcom/applovin/shadow/okhttp3/internal/concurrent/Task;Lcom/applovin/shadow/okhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;)V", "", "ns", "formatDuration", "(J)Ljava/lang/String;", RequestConfiguration.MAX_AD_CONTENT_RATING_T, "block", "logElapsed", "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Ll9/a;)Ljava/lang/Object;", OkHttp3Client.NETWORK_CLIENT_OKHTTP}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TaskLoggerKt {
    @NotNull
    public static final String formatDuration(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / 1000000000) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / 1000000) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - 500) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + 500) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / 1000000) + " ms";
        } else {
            str = ((j10 + 500000000) / 1000000000) + " s ";
        }
        w wVar = w.f22046a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        p.d(str2, "format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void log(Task task, TaskQueue taskQueue, String str) {
        Logger logger = TaskRunner.INSTANCE.getLogger();
        StringBuilder sb = new StringBuilder();
        sb.append(taskQueue.getName());
        sb.append(' ');
        w wVar = w.f22046a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        p.d(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(task.getName());
        logger.fine(sb.toString());
    }

    public static final <T> T logElapsed(@NotNull Task task, @NotNull TaskQueue queue, @NotNull a block) {
        long jNanoTime;
        p.e(task, "task");
        p.e(queue, "queue");
        p.e(block, "block");
        boolean zIsLoggable = TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE);
        if (zIsLoggable) {
            jNanoTime = queue.getTaskRunner().getBackend().nanoTime();
            log(task, queue, "starting");
        } else {
            jNanoTime = -1;
        }
        try {
            T t10 = (T) block.invoke();
            n.b(1);
            if (zIsLoggable) {
                log(task, queue, "finished run in " + formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
            }
            n.a(1);
            return t10;
        } catch (Throwable th) {
            n.b(1);
            if (zIsLoggable) {
                log(task, queue, "failed a run in " + formatDuration(queue.getTaskRunner().getBackend().nanoTime() - jNanoTime));
            }
            n.a(1);
            throw th;
        }
    }

    public static final void taskLog(@NotNull Task task, @NotNull TaskQueue queue, @NotNull a messageBlock) {
        p.e(task, "task");
        p.e(queue, "queue");
        p.e(messageBlock, "messageBlock");
        if (TaskRunner.INSTANCE.getLogger().isLoggable(Level.FINE)) {
            log(task, queue, (String) messageBlock.invoke());
        }
    }
}
