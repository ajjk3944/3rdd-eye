package org.snmp4j.util;

import java.util.LinkedList;
import org.snmp4j.log.LogAdapter;
import org.snmp4j.log.LogFactory;

/* loaded from: classes2.dex */
public class TaskScheduler implements Runnable {
    private static final long DEFAULT_SCHEDULER_TIMEOUT = 5;
    private boolean stop;
    private ThreadPool threadPool;
    private LogAdapter logger = LogFactory.getLogger(TaskScheduler.class);
    private LinkedList<SchedulerTask> tasks = new LinkedList<>();
    protected long schedulerTimeout = 5;

    public TaskScheduler(ThreadPool threadPool) {
        this.threadPool = threadPool;
    }

    public synchronized void addTask(SchedulerTask schedulerTask) {
        this.tasks.addLast(schedulerTask);
        notify();
    }

    public synchronized void clear() {
        this.tasks.clear();
    }

    public boolean isStop() {
        return this.stop;
    }

    public synchronized boolean removeTask(SchedulerTask schedulerTask) {
        return this.tasks.remove(schedulerTask);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean z10;
        while (!this.stop) {
            synchronized (this) {
                int i10 = 0;
                z10 = false;
                while (i10 < this.tasks.size()) {
                    try {
                        SchedulerTask schedulerTask = this.tasks.get(i10);
                        if (schedulerTask.isDone()) {
                            if (this.logger.isDebugEnabled()) {
                                this.logger.debug("Task '" + schedulerTask + "' is done");
                            }
                            this.tasks.removeFirst();
                        } else if (schedulerTask.isReadyToRun()) {
                            while (!this.threadPool.tryToExecute(schedulerTask)) {
                                try {
                                    synchronized (this.threadPool) {
                                        this.threadPool.wait(this.schedulerTimeout);
                                    }
                                } catch (InterruptedException unused) {
                                    this.logger.warn("Scheduler interrupted, aborting...");
                                    this.stop = true;
                                }
                            }
                            LinkedList<SchedulerTask> linkedList = this.tasks;
                            linkedList.addLast(linkedList.removeFirst());
                            i10--;
                            z10 = true;
                        } else {
                            continue;
                        }
                        i10++;
                    } finally {
                    }
                }
            }
            if (!z10) {
                try {
                    if (this.threadPool.isIdle()) {
                        synchronized (this) {
                            wait(this.schedulerTimeout);
                        }
                    } else {
                        synchronized (this.threadPool) {
                            this.threadPool.wait(this.schedulerTimeout);
                        }
                    }
                } catch (InterruptedException unused2) {
                    this.logger.warn("Scheduler interrupted, aborting...");
                    this.stop = true;
                }
            }
        }
        this.logger.info("Scheduler stopped.");
    }

    public void setStop(boolean z10) {
        this.stop = z10;
    }
}
