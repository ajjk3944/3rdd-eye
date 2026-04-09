package com.vungle.ads.internal.task;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import androidx.annotation.VisibleForTesting;
import com.vungle.ads.internal.util.p;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class h implements com.vungle.ads.internal.task.c {

    @NotNull
    private final com.vungle.ads.internal.task.a creator;

    @NotNull
    private final Executor executor;
    private long nextCheck;

    @NotNull
    private final List<b> pendingJobs;

    @NotNull
    private final Runnable pendingRunnable;

    @Nullable
    private final f threadPriorityHelper;

    @NotNull
    public static final a Companion = new a(null);

    @NotNull
    private static final Handler handler = new Handler(Looper.getMainLooper());
    private static final String TAG = h.class.getSimpleName();

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b {

        @Nullable
        private JobInfo info;
        private final long uptimeMillis;

        public b(long j10, @Nullable JobInfo jobInfo) {
            this.uptimeMillis = j10;
            this.info = jobInfo;
        }

        @Nullable
        public final JobInfo getInfo() {
            return this.info;
        }

        public final long getUptimeMillis() {
            return this.uptimeMillis;
        }

        public final void setInfo(@Nullable JobInfo jobInfo) {
            this.info = jobInfo;
        }
    }

    public static final class c implements Runnable {

        @NotNull
        private WeakReference<h> runner;

        public c(@NotNull WeakReference<h> runner) {
            p.e(runner, "runner");
            this.runner = runner;
        }

        @NotNull
        public final WeakReference<h> getRunner() {
            return this.runner;
        }

        @Override // java.lang.Runnable
        public void run() {
            h hVar = this.runner.get();
            if (hVar != null) {
                hVar.executePendingJobs();
            }
        }

        public final void setRunner(@NotNull WeakReference<h> weakReference) {
            p.e(weakReference, "<set-?>");
            this.runner = weakReference;
        }
    }

    public h(@NotNull com.vungle.ads.internal.task.a creator, @NotNull Executor executor, @Nullable f fVar) {
        p.e(creator, "creator");
        p.e(executor, "executor");
        this.creator = creator;
        this.executor = executor;
        this.threadPriorityHelper = fVar;
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
                    JobInfo info = bVar.getInfo();
                    if (info != null) {
                        this.executor.execute(new com.vungle.ads.internal.task.b(info, this.creator, this, this.threadPriorityHelper));
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

    @Override // com.vungle.ads.internal.task.c
    public synchronized void cancelPendingJob(@NotNull String tag) {
        try {
            p.e(tag, "tag");
            ArrayList arrayList = new ArrayList();
            for (b bVar : this.pendingJobs) {
                JobInfo info = bVar.getInfo();
                if (p.a(info != null ? info.getJobTag() : null, tag)) {
                    arrayList.add(bVar);
                }
            }
            this.pendingJobs.removeAll(arrayList);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.vungle.ads.internal.task.c
    public synchronized void execute(@NotNull JobInfo jobInfo) {
        try {
            p.e(jobInfo, "jobInfo");
            JobInfo jobInfoCopy = jobInfo.copy();
            if (jobInfoCopy != null) {
                String jobTag = jobInfoCopy.getJobTag();
                long delay = jobInfoCopy.getDelay();
                jobInfoCopy.setDelay(0L);
                if (jobInfoCopy.getUpdateCurrent()) {
                    for (b bVar : this.pendingJobs) {
                        JobInfo info = bVar.getInfo();
                        if (p.a(info != null ? info.getJobTag() : null, jobTag)) {
                            p.a aVar = com.vungle.ads.internal.util.p.Companion;
                            String TAG2 = TAG;
                            kotlin.jvm.internal.p.d(TAG2, "TAG");
                            aVar.d(TAG2, "replacing pending job with new " + jobTag);
                            this.pendingJobs.remove(bVar);
                        }
                    }
                }
                this.pendingJobs.add(new b(SystemClock.uptimeMillis() + delay, jobInfoCopy));
                executePendingJobs();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @VisibleForTesting
    public final int getPendingJobSize$vungle_ads_release() {
        return this.pendingJobs.size();
    }
}
