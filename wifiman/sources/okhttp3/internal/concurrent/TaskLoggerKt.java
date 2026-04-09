package okhttp3.internal.concurrent;

import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.U;
import org.snmp4j.mp.SnmpConstants;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lokhttp3/internal/concurrent/Task;", "task", "Lokhttp3/internal/concurrent/TaskQueue;", "queue", "", "message", "LYg/J;", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/internal/concurrent/Task;Lokhttp3/internal/concurrent/TaskQueue;Ljava/lang/String;)V", "", "ns", SnmpConfigurator.O_BIND_ADDRESS, "(J)Ljava/lang/String;", "okhttp"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TaskLoggerKt {
    public static final String b(long j10) {
        String str;
        if (j10 <= -999500000) {
            str = ((j10 - 500000000) / 1000000000) + " s ";
        } else if (j10 <= -999500) {
            str = ((j10 - 500000) / SnmpConstants.MILLISECOND_TO_NANOSECOND) + " ms";
        } else if (j10 <= 0) {
            str = ((j10 - 500) / 1000) + " µs";
        } else if (j10 < 999500) {
            str = ((j10 + 500) / 1000) + " µs";
        } else if (j10 < 999500000) {
            str = ((j10 + 500000) / SnmpConstants.MILLISECOND_TO_NANOSECOND) + " ms";
        } else {
            str = ((j10 + 500000000) / 1000000000) + " s ";
        }
        U u10 = U.f51694a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC6492s.h(str2, "format(format, *args)");
        return str2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(Task task, TaskQueue taskQueue, String str) {
        Logger loggerA = TaskRunner.INSTANCE.a();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(taskQueue.getName());
        sb2.append(' ');
        U u10 = U.f51694a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        AbstractC6492s.h(str2, "format(format, *args)");
        sb2.append(str2);
        sb2.append(": ");
        sb2.append(task.getName());
        loggerA.fine(sb2.toString());
    }
}
