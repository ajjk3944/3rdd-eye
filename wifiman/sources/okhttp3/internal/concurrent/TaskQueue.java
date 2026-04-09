package okhttp3.internal.concurrent;

import Yg.J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import okhttp3.internal.Util;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010!\n\u0002\b\b\u0018\u00002\u00020\u0001:\u00012B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u001d\u001a\u0004\b\u001e\u0010\u0019R\"\u0010$\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\u0017\"\u0004\b\"\u0010#R$\u0010*\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b\u001f\u0010'\"\u0004\b(\u0010)R \u0010/\u001a\b\u0012\u0004\u0012\u00020\b0+8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010.R\"\u00101\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010 \u001a\u0004\b%\u0010\u0017\"\u0004\b0\u0010#¨\u00063"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue;", "", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "", "name", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner;Ljava/lang/String;)V", "Lokhttp3/internal/concurrent/Task;", "task", "", "delayNanos", "LYg/J;", "i", "(Lokhttp3/internal/concurrent/Task;J)V", "", "recurrence", "k", "(Lokhttp3/internal/concurrent/Task;JZ)Z", SnmpConfigurator.O_AUTH_PROTOCOL, "()V", SnmpConfigurator.O_CONTEXT_NAME, SnmpConfigurator.O_BIND_ADDRESS, "()Z", "toString", "()Ljava/lang/String;", "Lokhttp3/internal/concurrent/TaskRunner;", "h", "()Lokhttp3/internal/concurrent/TaskRunner;", "Ljava/lang/String;", "f", SnmpConfigurator.O_COMMUNITY, "Z", "g", "setShutdown$okhttp", "(Z)V", "shutdown", "d", "Lokhttp3/internal/concurrent/Task;", "()Lokhttp3/internal/concurrent/Task;", "l", "(Lokhttp3/internal/concurrent/Task;)V", "activeTask", "", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/util/List;", "()Ljava/util/List;", "futureTasks", "m", "cancelActiveTask", "AwaitIdleTask", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TaskQueue {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final TaskRunner taskRunner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean shutdown;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Task activeTask;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List futureTasks;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean cancelActiveTask;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lokhttp3/internal/concurrent/TaskQueue$AwaitIdleTask;", "Lokhttp3/internal/concurrent/Task;", "<init>", "()V", "", "f", "()J", "Ljava/util/concurrent/CountDownLatch;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "Ljava/util/concurrent/CountDownLatch;", "getLatch", "()Ljava/util/concurrent/CountDownLatch;", "latch", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    private static final class AwaitIdleTask extends Task {

        /* renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final CountDownLatch latch;

        public AwaitIdleTask() {
            super(Util.f56224i + " awaitIdle", false);
            this.latch = new CountDownLatch(1);
        }

        @Override // okhttp3.internal.concurrent.Task
        public long f() {
            this.latch.countDown();
            return -1L;
        }
    }

    public TaskQueue(TaskRunner taskRunner, String name) {
        AbstractC6492s.i(taskRunner, "taskRunner");
        AbstractC6492s.i(name, "name");
        this.taskRunner = taskRunner;
        this.name = name;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void j(TaskQueue taskQueue, Task task, long j10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = 0;
        }
        taskQueue.i(task, j10);
    }

    public final void a() {
        if (Util.f56223h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            try {
                if (b()) {
                    this.taskRunner.h(this);
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        Task task = this.activeTask;
        if (task != null) {
            AbstractC6492s.f(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z10 = false;
        for (int size = this.futureTasks.size() - 1; -1 < size; size--) {
            if (((Task) this.futureTasks.get(size)).getCancelable()) {
                Task task2 = (Task) this.futureTasks.get(size);
                if (TaskRunner.INSTANCE.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task2, this, "canceled");
                }
                this.futureTasks.remove(size);
                z10 = true;
            }
        }
        return z10;
    }

    /* renamed from: c, reason: from getter */
    public final Task getActiveTask() {
        return this.activeTask;
    }

    /* renamed from: d, reason: from getter */
    public final boolean getCancelActiveTask() {
        return this.cancelActiveTask;
    }

    /* renamed from: e, reason: from getter */
    public final List getFutureTasks() {
        return this.futureTasks;
    }

    /* renamed from: f, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getShutdown() {
        return this.shutdown;
    }

    /* renamed from: h, reason: from getter */
    public final TaskRunner getTaskRunner() {
        return this.taskRunner;
    }

    public final void i(Task task, long delayNanos) {
        AbstractC6492s.i(task, "task");
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (k(task, delayNanos, false)) {
                    this.taskRunner.h(this);
                }
                J j10 = J.f24997a;
            } else if (task.getCancelable()) {
                if (TaskRunner.INSTANCE.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (TaskRunner.INSTANCE.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean k(Task task, long delayNanos, boolean recurrence) {
        String str;
        AbstractC6492s.i(task, "task");
        task.e(this);
        long jB = this.taskRunner.getBackend().b();
        long j10 = jB + delayNanos;
        int iIndexOf = this.futureTasks.indexOf(task);
        if (iIndexOf != -1) {
            if (task.getNextExecuteNanoTime() <= j10) {
                if (TaskRunner.INSTANCE.a().isLoggable(Level.FINE)) {
                    TaskLoggerKt.c(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(iIndexOf);
        }
        task.g(j10);
        if (TaskRunner.INSTANCE.a().isLoggable(Level.FINE)) {
            if (recurrence) {
                str = "run again after " + TaskLoggerKt.b(j10 - jB);
            } else {
                str = "scheduled after " + TaskLoggerKt.b(j10 - jB);
            }
            TaskLoggerKt.c(task, this, str);
        }
        Iterator it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (((Task) it.next()).getNextExecuteNanoTime() - jB > delayNanos) {
                break;
            }
            size++;
        }
        if (size == -1) {
            size = this.futureTasks.size();
        }
        this.futureTasks.add(size, task);
        return size == 0;
    }

    public final void l(Task task) {
        this.activeTask = task;
    }

    public final void m(boolean z10) {
        this.cancelActiveTask = z10;
    }

    public final void n() {
        if (Util.f56223h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            try {
                this.shutdown = true;
                if (b()) {
                    this.taskRunner.h(this);
                }
                J j10 = J.f24997a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public String toString() {
        return this.name;
    }
}
