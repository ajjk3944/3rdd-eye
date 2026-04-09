package okhttp3.internal.concurrent;

import Yg.J;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC6492s;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okhttp3.internal.Util;
import org.snmp4j.mp.MPv3;
import org.snmp4j.util.SnmpConfigurator;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00122\u00020\u0001:\u0003./0B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001f\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\b¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0016\u0010$\u001a\u00020\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010#R\u0016\u0010&\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010%R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010(R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00100'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010(R\u0014\u0010-\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,¨\u00061"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner;", "", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "backend", "<init>", "(Lokhttp3/internal/concurrent/TaskRunner$Backend;)V", "Lokhttp3/internal/concurrent/Task;", "task", "LYg/J;", SnmpConfigurator.O_AUTHORITATIVE_ENGINE_ID, "(Lokhttp3/internal/concurrent/Task;)V", "j", "", "delayNanos", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/internal/concurrent/Task;J)V", "Lokhttp3/internal/concurrent/TaskQueue;", "taskQueue", "h", "(Lokhttp3/internal/concurrent/TaskQueue;)V", "d", "()Lokhttp3/internal/concurrent/Task;", "i", "()Lokhttp3/internal/concurrent/TaskQueue;", "f", "()V", SnmpConfigurator.O_AUTH_PROTOCOL, "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "g", "()Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", SnmpConfigurator.O_BIND_ADDRESS, "I", "nextQueueName", "", "Z", "coordinatorWaiting", "J", "coordinatorWakeUpAt", "", "Ljava/util/List;", "busyQueues", "readyQueues", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "runnable", "Backend", "Companion", "RealBackend", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TaskRunner {

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: i, reason: collision with root package name */
    public static final TaskRunner f56345i = new TaskRunner(new RealBackend(Util.N(Util.f56224i + " TaskRunner", true)));

    /* renamed from: j, reason: collision with root package name */
    private static final Logger f56346j;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Backend backend;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nextQueueName;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean coordinatorWaiting;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long coordinatorWakeUpAt;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List busyQueues;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List readyQueues;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Runnable runnable;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\rH&¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Backend;", "", "", SnmpConfigurator.O_BIND_ADDRESS, "()J", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/internal/concurrent/TaskRunner;)V", "nanos", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/internal/concurrent/TaskRunner;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Backend {
        void a(TaskRunner taskRunner);

        long b();

        void c(TaskRunner taskRunner, long nanos);

        void execute(Runnable runnable);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\n\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$Companion;", "", "<init>", "()V", "Ljava/util/logging/Logger;", "logger", "Ljava/util/logging/Logger;", SnmpConfigurator.O_AUTH_PROTOCOL, "()Ljava/util/logging/Logger;", "Lokhttp3/internal/concurrent/TaskRunner;", "INSTANCE", "Lokhttp3/internal/concurrent/TaskRunner;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final Logger a() {
            return TaskRunner.f56346j;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0016¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/concurrent/TaskRunner$RealBackend;", "Lokhttp3/internal/concurrent/TaskRunner$Backend;", "Ljava/util/concurrent/ThreadFactory;", "threadFactory", "<init>", "(Ljava/util/concurrent/ThreadFactory;)V", "", SnmpConfigurator.O_BIND_ADDRESS, "()J", "Lokhttp3/internal/concurrent/TaskRunner;", "taskRunner", "LYg/J;", SnmpConfigurator.O_AUTH_PROTOCOL, "(Lokhttp3/internal/concurrent/TaskRunner;)V", "nanos", SnmpConfigurator.O_COMMUNITY, "(Lokhttp3/internal/concurrent/TaskRunner;J)V", "Ljava/lang/Runnable;", "runnable", "execute", "(Ljava/lang/Runnable;)V", "Ljava/util/concurrent/ThreadPoolExecutor;", "Ljava/util/concurrent/ThreadPoolExecutor;", "executor", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class RealBackend implements Backend {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final ThreadPoolExecutor executor;

        public RealBackend(ThreadFactory threadFactory) {
            AbstractC6492s.i(threadFactory, "threadFactory");
            this.executor = new ThreadPoolExecutor(0, MPv3.MAX_MESSAGE_ID, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void a(TaskRunner taskRunner) {
            AbstractC6492s.i(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public long b() {
            return System.nanoTime();
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void c(TaskRunner taskRunner, long nanos) throws InterruptedException {
            AbstractC6492s.i(taskRunner, "taskRunner");
            long j10 = nanos / 1000000;
            long j11 = nanos - (1000000 * j10);
            if (j10 > 0 || nanos > 0) {
                taskRunner.wait(j10, (int) j11);
            }
        }

        @Override // okhttp3.internal.concurrent.TaskRunner.Backend
        public void execute(Runnable runnable) {
            AbstractC6492s.i(runnable, "runnable");
            this.executor.execute(runnable);
        }
    }

    static {
        Logger logger = Logger.getLogger(TaskRunner.class.getName());
        AbstractC6492s.h(logger, "getLogger(TaskRunner::class.java.name)");
        f56346j = logger;
    }

    public TaskRunner(Backend backend) {
        AbstractC6492s.i(backend, "backend");
        this.backend = backend;
        this.nextQueueName = 10000;
        this.busyQueues = new ArrayList();
        this.readyQueues = new ArrayList();
        this.runnable = new Runnable() { // from class: okhttp3.internal.concurrent.TaskRunner$runnable$1
            @Override // java.lang.Runnable
            public void run() {
                Task taskD;
                long jB;
                while (true) {
                    TaskRunner taskRunner = this.f56355a;
                    synchronized (taskRunner) {
                        taskD = taskRunner.d();
                    }
                    if (taskD == null) {
                        return;
                    }
                    TaskQueue queue = taskD.getQueue();
                    AbstractC6492s.f(queue);
                    TaskRunner taskRunner2 = this.f56355a;
                    boolean zIsLoggable = TaskRunner.INSTANCE.a().isLoggable(Level.FINE);
                    if (zIsLoggable) {
                        jB = queue.getTaskRunner().getBackend().b();
                        TaskLoggerKt.c(taskD, queue, "starting");
                    } else {
                        jB = -1;
                    }
                    try {
                        try {
                            taskRunner2.j(taskD);
                            J j10 = J.f24997a;
                            if (zIsLoggable) {
                                TaskLoggerKt.c(taskD, queue, "finished run in " + TaskLoggerKt.b(queue.getTaskRunner().getBackend().b() - jB));
                            }
                        } finally {
                        }
                    } catch (Throwable th2) {
                        if (zIsLoggable) {
                            TaskLoggerKt.c(taskD, queue, "failed a run in " + TaskLoggerKt.b(queue.getTaskRunner().getBackend().b() - jB));
                        }
                        throw th2;
                    }
                }
            }
        };
    }

    private final void c(Task task, long delayNanos) {
        if (Util.f56223h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        TaskQueue queue = task.getQueue();
        AbstractC6492s.f(queue);
        if (queue.getActiveTask() != task) {
            throw new IllegalStateException("Check failed.");
        }
        boolean cancelActiveTask = queue.getCancelActiveTask();
        queue.m(false);
        queue.l(null);
        this.busyQueues.remove(queue);
        if (delayNanos != -1 && !cancelActiveTask && !queue.getShutdown()) {
            queue.k(task, delayNanos, true);
        }
        if (queue.getFutureTasks().isEmpty()) {
            return;
        }
        this.readyQueues.add(queue);
    }

    private final void e(Task task) {
        if (Util.f56223h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        task.g(-1L);
        TaskQueue queue = task.getQueue();
        AbstractC6492s.f(queue);
        queue.getFutureTasks().remove(task);
        this.readyQueues.remove(queue);
        queue.l(task);
        this.busyQueues.add(queue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void j(Task task) {
        if (Util.f56223h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(task.getName());
        try {
            long jF = task.f();
            synchronized (this) {
                c(task, jF);
                J j10 = J.f24997a;
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th2) {
            synchronized (this) {
                c(task, -1L);
                J j11 = J.f24997a;
                threadCurrentThread.setName(name);
                throw th2;
            }
        }
    }

    public final Task d() {
        boolean z10;
        if (Util.f56223h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.readyQueues.isEmpty()) {
            long jB = this.backend.b();
            Iterator it = this.readyQueues.iterator();
            long jMin = Long.MAX_VALUE;
            Task task = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                Task task2 = (Task) ((TaskQueue) it.next()).getFutureTasks().get(0);
                long jMax = Math.max(0L, task2.getNextExecuteNanoTime() - jB);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (task != null) {
                        z10 = true;
                        break;
                    }
                    task = task2;
                }
            }
            if (task != null) {
                e(task);
                if (z10 || (!this.coordinatorWaiting && !this.readyQueues.isEmpty())) {
                    this.backend.execute(this.runnable);
                }
                return task;
            }
            if (this.coordinatorWaiting) {
                if (jMin < this.coordinatorWakeUpAt - jB) {
                    this.backend.a(this);
                }
                return null;
            }
            this.coordinatorWaiting = true;
            this.coordinatorWakeUpAt = jB + jMin;
            try {
                try {
                    this.backend.c(this, jMin);
                } catch (InterruptedException unused) {
                    f();
                }
            } finally {
                this.coordinatorWaiting = false;
            }
        }
        return null;
    }

    public final void f() {
        int size = this.busyQueues.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                ((TaskQueue) this.busyQueues.get(size)).b();
            }
        }
        for (int size2 = this.readyQueues.size() - 1; -1 < size2; size2--) {
            TaskQueue taskQueue = (TaskQueue) this.readyQueues.get(size2);
            taskQueue.b();
            if (taskQueue.getFutureTasks().isEmpty()) {
                this.readyQueues.remove(size2);
            }
        }
    }

    /* renamed from: g, reason: from getter */
    public final Backend getBackend() {
        return this.backend;
    }

    public final void h(TaskQueue taskQueue) {
        AbstractC6492s.i(taskQueue, "taskQueue");
        if (Util.f56223h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.getActiveTask() == null) {
            if (taskQueue.getFutureTasks().isEmpty()) {
                this.readyQueues.remove(taskQueue);
            } else {
                Util.c(this.readyQueues, taskQueue);
            }
        }
        if (this.coordinatorWaiting) {
            this.backend.a(this);
        } else {
            this.backend.execute(this.runnable);
        }
    }

    public final TaskQueue i() {
        int i10;
        synchronized (this) {
            i10 = this.nextQueueName;
            this.nextQueueName = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new TaskQueue(this, sb2.toString());
    }
}
