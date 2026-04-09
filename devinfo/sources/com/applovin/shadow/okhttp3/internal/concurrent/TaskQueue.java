package com.applovin.shadow.okhttp3.internal.concurrent;

import com.applovin.shadow.okhttp3.internal.Util;
import d.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import mk.a;
import nk.k;
import zj.n;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class TaskQueue {
    private Task activeTask;
    private boolean cancelActiveTask;
    private final List<Task> futureTasks;
    private final String name;
    private boolean shutdown;
    private final TaskRunner taskRunner;

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    public static final class AwaitIdleTask extends Task {
        private final CountDownLatch latch;

        public AwaitIdleTask() {
            super(h.w(new StringBuilder(), Util.okHttpName, " awaitIdle"), false);
            this.latch = new CountDownLatch(1);
        }

        public final CountDownLatch getLatch() {
            return this.latch;
        }

        @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.latch.countDown();
            return -1L;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.shadow.okhttp3.internal.concurrent.TaskQueue$execute$1, reason: invalid class name */
    public static final class AnonymousClass1 extends Task {
        final /* synthetic */ a $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(String str, boolean z3, a aVar) {
            super(str, z3);
            this.$block = aVar;
        }

        @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
        public long runOnce() {
            this.$block.invoke();
            return -1L;
        }
    }

    /* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
    /* renamed from: com.applovin.shadow.okhttp3.internal.concurrent.TaskQueue$schedule$2, reason: invalid class name */
    public static final class AnonymousClass2 extends Task {
        final /* synthetic */ a $block;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(String str, a aVar) {
            super(str, false, 2, null);
            this.$block = aVar;
        }

        @Override // com.applovin.shadow.okhttp3.internal.concurrent.Task
        public long runOnce() {
            return ((Number) this.$block.invoke()).longValue();
        }
    }

    public TaskQueue(TaskRunner taskRunner, String str) {
        k.e(taskRunner, "taskRunner");
        k.e(str, "name");
        this.taskRunner = taskRunner;
        this.name = str;
        this.futureTasks = new ArrayList();
    }

    public static /* synthetic */ void execute$default(TaskQueue taskQueue, String str, long j, boolean z3, a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j = 0;
        }
        if ((i4 & 4) != 0) {
            z3 = true;
        }
        k.e(str, "name");
        k.e(aVar, "block");
        taskQueue.schedule(new AnonymousClass1(str, z3, aVar), j);
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, Task task, long j, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j = 0;
        }
        taskQueue.schedule(task, j);
    }

    public final void cancelAll() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
        }
    }

    public final boolean cancelAllAndDecide$okhttp() {
        Task task = this.activeTask;
        if (task != null) {
            k.b(task);
            if (task.getCancelable()) {
                this.cancelActiveTask = true;
            }
        }
        boolean z3 = false;
        for (int size = this.futureTasks.size() - 1; -1 < size; size--) {
            if (this.futureTasks.get(size).getCancelable()) {
                Task task2 = this.futureTasks.get(size);
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task2, this, "canceled");
                }
                this.futureTasks.remove(size);
                z3 = true;
            }
        }
        return z3;
    }

    public final void execute(String str, long j, boolean z3, a aVar) {
        k.e(str, "name");
        k.e(aVar, "block");
        schedule(new AnonymousClass1(str, z3, aVar), j);
    }

    public final Task getActiveTask$okhttp() {
        return this.activeTask;
    }

    public final boolean getCancelActiveTask$okhttp() {
        return this.cancelActiveTask;
    }

    public final List<Task> getFutureTasks$okhttp() {
        return this.futureTasks;
    }

    public final String getName$okhttp() {
        return this.name;
    }

    public final List<Task> getScheduledTasks() {
        List<Task> listR0;
        synchronized (this.taskRunner) {
            listR0 = n.r0(this.futureTasks);
        }
        return listR0;
    }

    public final boolean getShutdown$okhttp() {
        return this.shutdown;
    }

    public final TaskRunner getTaskRunner$okhttp() {
        return this.taskRunner;
    }

    public final CountDownLatch idleLatch() {
        synchronized (this.taskRunner) {
            if (this.activeTask == null && this.futureTasks.isEmpty()) {
                return new CountDownLatch(0);
            }
            Task task = this.activeTask;
            if (task instanceof AwaitIdleTask) {
                return ((AwaitIdleTask) task).getLatch();
            }
            for (Task task2 : this.futureTasks) {
                if (task2 instanceof AwaitIdleTask) {
                    return ((AwaitIdleTask) task2).getLatch();
                }
            }
            AwaitIdleTask awaitIdleTask = new AwaitIdleTask();
            if (scheduleAndDecide$okhttp(awaitIdleTask, 0L, false)) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
            return awaitIdleTask.getLatch();
        }
    }

    public final void schedule(Task task, long j) {
        k.e(task, "task");
        synchronized (this.taskRunner) {
            if (!this.shutdown) {
                if (scheduleAndDecide$okhttp(task, j, false)) {
                    this.taskRunner.kickCoordinator$okhttp(this);
                }
            } else if (task.getCancelable()) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean scheduleAndDecide$okhttp(Task task, long j, boolean z3) {
        String str;
        k.e(task, "task");
        task.initQueue$okhttp(this);
        long jNanoTime = this.taskRunner.getBackend().nanoTime();
        long j8 = jNanoTime + j;
        int iIndexOf = this.futureTasks.indexOf(task);
        if (iIndexOf != -1) {
            if (task.getNextExecuteNanoTime$okhttp() <= j8) {
                if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
                    TaskLoggerKt.log(task, this, "already scheduled");
                }
                return false;
            }
            this.futureTasks.remove(iIndexOf);
        }
        task.setNextExecuteNanoTime$okhttp(j8);
        if (TaskRunner.Companion.getLogger().isLoggable(Level.FINE)) {
            if (z3) {
                str = "run again after " + TaskLoggerKt.formatDuration(j8 - jNanoTime);
            } else {
                str = "scheduled after " + TaskLoggerKt.formatDuration(j8 - jNanoTime);
            }
            TaskLoggerKt.log(task, this, str);
        }
        Iterator<Task> it = this.futureTasks.iterator();
        int size = 0;
        while (true) {
            if (!it.hasNext()) {
                size = -1;
                break;
            }
            if (it.next().getNextExecuteNanoTime$okhttp() - jNanoTime > j) {
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

    public final void setActiveTask$okhttp(Task task) {
        this.activeTask = task;
    }

    public final void setCancelActiveTask$okhttp(boolean z3) {
        this.cancelActiveTask = z3;
    }

    public final void setShutdown$okhttp(boolean z3) {
        this.shutdown = z3;
    }

    public final void shutdown() {
        if (Util.assertionsEnabled && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.taskRunner) {
            this.shutdown = true;
            if (cancelAllAndDecide$okhttp()) {
                this.taskRunner.kickCoordinator$okhttp(this);
            }
        }
    }

    public String toString() {
        return this.name;
    }

    public static /* synthetic */ void schedule$default(TaskQueue taskQueue, String str, long j, a aVar, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            j = 0;
        }
        k.e(str, "name");
        k.e(aVar, "block");
        taskQueue.schedule(new AnonymousClass2(str, aVar), j);
    }

    public final void schedule(String str, long j, a aVar) {
        k.e(str, "name");
        k.e(aVar, "block");
        schedule(new AnonymousClass2(str, aVar), j);
    }
}
