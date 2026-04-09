package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.vungle.ads.internal.util.k;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* compiled from: VungleJobRunner.kt */
/* loaded from: classes2.dex */
public final class m implements f {
    private final com.vungle.ads.internal.task.c creator;
    private final Executor executor;
    private long nextCheck;
    private final List<b> pendingJobs;
    private final Runnable pendingRunnable;
    private final j threadPriorityHelper;
    public static final a Companion = new a(null);
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final String TAG = m.class.getSimpleName();

    /* compiled from: VungleJobRunner.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    /* compiled from: VungleJobRunner.kt */
    public static final class b {
        private d info;
        private final long uptimeMillis;

        public b(long j4, d dVar) {
            this.uptimeMillis = j4;
            this.info = dVar;
        }

        public final d getInfo() {
            return this.info;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }

        public final void setInfo(d dVar) {
            this.info = dVar;
        }
    }

    /* compiled from: VungleJobRunner.kt */
    public static final class c implements Runnable {
        private WeakReference<m> runner;

        public c(WeakReference<m> runner) {
            kotlin.jvm.internal.l.f(runner, "runner");
            this.runner = runner;
        }

        public final WeakReference<m> getRunner() {
            return this.runner;
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = this.runner.get();
            if (mVar != null) {
                mVar.executePendingJobs();
            }
        }

        public final void setRunner(WeakReference<m> weakReference) {
            kotlin.jvm.internal.l.f(weakReference, "<set-?>");
            this.runner = weakReference;
        }
    }

    public m(com.vungle.ads.internal.task.c creator, Executor executor, j jVar) {
        kotlin.jvm.internal.l.f(creator, "creator");
        kotlin.jvm.internal.l.f(executor, "executor");
        this.creator = creator;
        this.executor = executor;
        this.threadPriorityHelper = jVar;
        this.nextCheck = Long.MAX_VALUE;
        this.pendingJobs = new CopyOnWriteArrayList();
        this.pendingRunnable = new c(new WeakReference(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void executePendingJobs() {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            long jMin = Long.MAX_VALUE;
            for (b bVar : this.pendingJobs) {
                if (jUptimeMillis >= bVar.getUptimeMillis()) {
                    this.pendingJobs.remove(bVar);
                    d info = bVar.getInfo();
                    if (info != null) {
                        this.executor.execute(new e(info, this.creator, this, this.threadPriorityHelper));
                    }
                } else {
                    jMin = Math.min(jMin, bVar.getUptimeMillis());
                }
            }
            if (jMin != Long.MAX_VALUE && jMin != this.nextCheck) {
                Handler handler2 = handler;
                handler2.removeCallbacks(this.pendingRunnable);
                handler2.postAtTime(this.pendingRunnable, TAG, jMin);
            }
            this.nextCheck = jMin;
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.vungle.ads.internal.task.f
    public synchronized void cancelPendingJob(String tag) {
        try {
            kotlin.jvm.internal.l.f(tag, "tag");
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.pendingJobs) {
                d info = bVar.getInfo();
                if (kotlin.jvm.internal.l.b(info != null ? info.getJobTag() : null, tag)) {
                    arrayList.add(bVar);
                }
            }
            this.pendingJobs.removeAll(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.vungle.ads.internal.task.f
    public synchronized void execute(d jobInfo) {
        try {
            kotlin.jvm.internal.l.f(jobInfo, "jobInfo");
            d dVarCopy = jobInfo.copy();
            if (dVarCopy != null) {
                String jobTag = dVarCopy.getJobTag();
                long delay = dVarCopy.getDelay();
                dVarCopy.setDelay(0L);
                if (dVarCopy.getUpdateCurrent()) {
                    for (b bVar : this.pendingJobs) {
                        d info = bVar.getInfo();
                        if (kotlin.jvm.internal.l.b(info != null ? info.getJobTag() : null, jobTag)) {
                            k.a aVar = com.vungle.ads.internal.util.k.Companion;
                            String TAG2 = TAG;
                            kotlin.jvm.internal.l.e(TAG2, "TAG");
                            aVar.d(TAG2, "replacing pending job with new " + jobTag);
                            this.pendingJobs.remove(bVar);
                        }
                    }
                }
                this.pendingJobs.add(new b(SystemClock.uptimeMillis() + delay, dVarCopy));
                executePendingJobs();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }
}
