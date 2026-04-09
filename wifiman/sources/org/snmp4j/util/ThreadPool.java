package org.snmp4j.util;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.snmp4j.SNMP4JSettings;

/* loaded from: classes2.dex */
public class ThreadPool implements WorkerPool {
    private static final int DEFAULT_TASK_MANAGER_BUSY_TIMEOUT_MILLIS = 20;
    protected List<TaskManager> taskManagers;
    protected String name = "ThreadPool";
    protected volatile boolean stop = false;
    protected boolean respawnThreads = false;
    protected int taskManagersBusyTimeoutMillis = DEFAULT_TASK_MANAGER_BUSY_TIMEOUT_MILLIS;

    class TaskManager extends Thread {
        private volatile boolean run;
        private WorkerTask task;

        public TaskManager(String str) {
            super(str);
            this.task = null;
            this.run = true;
        }

        public synchronized void execute(WorkerTask workerTask) {
            if (this.task != null) {
                throw new IllegalStateException("TaskManager is not idle");
            }
            this.task = workerTask;
            notify();
        }

        public boolean isIdle() {
            return this.task == null && this.run;
        }

        public boolean isStopped() {
            return ThreadPool.this.stop;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            while (!ThreadPool.this.stop && this.run) {
                if (this.task != null) {
                    synchronized (this) {
                        this.task.run();
                        this.task = null;
                    }
                    synchronized (ThreadPool.this) {
                        ThreadPool.this.notify();
                    }
                } else {
                    synchronized (this) {
                        try {
                            if (this.task == null) {
                                wait();
                            }
                        } catch (InterruptedException unused) {
                            this.run = ThreadPool.this.respawnThreads;
                            return;
                        }
                    }
                }
            }
        }

        public void terminate() {
            ThreadPool.this.stop = true;
            WorkerTask workerTask = this.task;
            if (workerTask != null) {
                workerTask.terminate();
            }
        }
    }

    protected ThreadPool() {
    }

    public static ThreadPool create(String str, int i10) {
        ThreadPool threadPool = new ThreadPool();
        threadPool.setup(str, i10);
        return threadPool;
    }

    @Override // org.snmp4j.util.WorkerPool
    public void cancel() {
        this.stop = true;
        for (TaskManager taskManager : this.taskManagers) {
            taskManager.terminate();
            taskManager.interrupt();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0065, code lost:
    
        wait(r3.taskManagersBusyTimeoutMillis);
     */
    @Override // org.snmp4j.util.WorkerPool
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void execute(org.snmp4j.util.WorkerTask r4) {
        /*
            r3 = this;
        L0:
            r0 = 0
        L1:
            java.util.List<org.snmp4j.util.ThreadPool$TaskManager> r1 = r3.taskManagers
            int r1 = r1.size()
            if (r0 >= r1) goto L49
            java.util.List<org.snmp4j.util.ThreadPool$TaskManager> r1 = r3.taskManagers
            java.lang.Object r1 = r1.get(r0)
            org.snmp4j.util.ThreadPool$TaskManager r1 = (org.snmp4j.util.ThreadPool.TaskManager) r1
            boolean r2 = r3.respawnThreads
            if (r2 == 0) goto L2e
            boolean r2 = r1.isAlive()
            if (r2 != 0) goto L2e
            org.snmp4j.util.ThreadPool$TaskManager r1 = new org.snmp4j.util.ThreadPool$TaskManager
            java.lang.String r2 = r3.name
            java.lang.String r2 = r3.getTaskManagerName(r2, r0)
            r1.<init>(r2)
            java.util.List<org.snmp4j.util.ThreadPool$TaskManager> r2 = r3.taskManagers
            r2.set(r0, r1)
            r1.start()
        L2e:
            boolean r2 = r1.isIdle()
            if (r2 == 0) goto L46
            monitor-enter(r3)
            boolean r2 = r1.isIdle()     // Catch: java.lang.Throwable -> L40
            if (r2 == 0) goto L42
            r1.execute(r4)     // Catch: java.lang.Throwable -> L40 java.lang.IllegalStateException -> L42
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            return
        L40:
            r4 = move-exception
            goto L44
        L42:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            goto L46
        L44:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L40
            throw r4
        L46:
            int r0 = r0 + 1
            goto L1
        L49:
            monitor-enter(r3)
            java.util.List<org.snmp4j.util.ThreadPool$TaskManager> r0 = r3.taskManagers     // Catch: java.lang.Throwable -> L63
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L63
        L50:
            boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L65
            java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> L63
            org.snmp4j.util.ThreadPool$TaskManager r1 = (org.snmp4j.util.ThreadPool.TaskManager) r1     // Catch: java.lang.Throwable -> L63
            boolean r1 = r1.isIdle()     // Catch: java.lang.Throwable -> L63
            if (r1 == 0) goto L50
            goto L70
        L63:
            r4 = move-exception
            goto L72
        L65:
            int r0 = r3.taskManagersBusyTimeoutMillis     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L6c
            long r0 = (long) r0     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L6c
            r3.wait(r0)     // Catch: java.lang.Throwable -> L63 java.lang.InterruptedException -> L6c
            goto L70
        L6c:
            r0 = move-exception
            r3.handleInterruptedExceptionOnExecute(r0, r4)     // Catch: java.lang.Throwable -> L63
        L70:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            goto L0
        L72:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L63
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: org.snmp4j.util.ThreadPool.execute(org.snmp4j.util.WorkerTask):void");
    }

    public String getName() {
        return this.name;
    }

    protected String getTaskManagerName(String str, int i10) {
        return str + "." + i10;
    }

    public int getTaskManagersBusyTimeoutMillis() {
        return this.taskManagersBusyTimeoutMillis;
    }

    protected void handleInterruptedExceptionOnExecute(InterruptedException interruptedException, WorkerTask workerTask) {
        if (SNMP4JSettings.isForwardRuntimeExceptions()) {
            throw new RuntimeException(interruptedException);
        }
    }

    public void interrupt() {
        Iterator<TaskManager> it = this.taskManagers.iterator();
        while (it.hasNext()) {
            it.next().interrupt();
        }
    }

    @Override // org.snmp4j.util.WorkerPool
    public boolean isIdle() {
        Iterator<TaskManager> it = this.taskManagers.iterator();
        while (it.hasNext()) {
            if (!it.next().isIdle()) {
                return false;
            }
        }
        return true;
    }

    public boolean isRespawnThreads() {
        return this.respawnThreads;
    }

    public void setRespawnThreads(boolean z10) {
        this.respawnThreads = z10;
    }

    public void setTaskManagersBusyTimeoutMillis(int i10) {
        this.taskManagersBusyTimeoutMillis = i10;
    }

    protected void setup(String str, int i10) {
        this.name = str;
        this.taskManagers = new CopyOnWriteArrayList();
        for (int i11 = 0; i11 < i10; i11++) {
            TaskManager taskManager = new TaskManager(getTaskManagerName(str, i11));
            this.taskManagers.add(taskManager);
            taskManager.start();
        }
    }

    @Override // org.snmp4j.util.WorkerPool
    public void stop() throws InterruptedException {
        List<TaskManager> list;
        synchronized (this) {
            this.stop = true;
            list = this.taskManagers;
        }
        for (TaskManager taskManager : list) {
            taskManager.terminate();
            synchronized (taskManager) {
                taskManager.notify();
            }
            try {
                taskManager.join();
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @Override // org.snmp4j.util.WorkerPool
    public boolean tryToExecute(WorkerTask workerTask) {
        for (int i10 = 0; i10 < this.taskManagers.size(); i10++) {
            TaskManager taskManager = this.taskManagers.get(i10);
            if (this.respawnThreads && !taskManager.isAlive()) {
                taskManager = new TaskManager(getTaskManagerName(this.name, i10));
                taskManager.start();
            }
            if (taskManager.isIdle()) {
                try {
                    taskManager.execute(workerTask);
                    return true;
                } catch (IllegalStateException unused) {
                    continue;
                }
            }
        }
        return false;
    }
}
