package org.snmp4j.util;

import org.snmp4j.SNMP4JSettings;

/* loaded from: classes2.dex */
public class DefaultThreadFactory implements ThreadFactory {
    private long joinTimeout = SNMP4JSettings.getThreadJoinTimeout();

    public class WorkerThread implements WorkerTask {
        private boolean started = false;
        private WorkerTask task;
        private Thread thread;

        public WorkerThread(String str, WorkerTask workerTask) {
            this.thread = new Thread(workerTask, str);
            this.task = workerTask;
        }

        @Override // org.snmp4j.util.WorkerTask
        public void interrupt() {
            this.task.interrupt();
            this.thread.interrupt();
        }

        @Override // org.snmp4j.util.WorkerTask
        public void join() throws InterruptedException {
            this.task.join();
            this.thread.join(DefaultThreadFactory.this.joinTimeout);
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.started) {
                this.thread.run();
            } else {
                this.started = true;
                this.thread.start();
            }
        }

        @Override // org.snmp4j.util.WorkerTask
        public void terminate() {
            this.task.terminate();
        }
    }

    @Override // org.snmp4j.util.ThreadFactory
    public WorkerTask createWorkerThread(String str, WorkerTask workerTask, boolean z10) {
        WorkerThread workerThread = new WorkerThread(str, workerTask);
        workerThread.thread.setDaemon(z10);
        return workerThread;
    }

    public void setThreadJoinTimeout(long j10) {
        this.joinTimeout = j10;
    }
}
