package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.util.k;

/* compiled from: JobRunnable.kt */
/* loaded from: classes2.dex */
public final class e extends h {
    public static final a Companion = new a(null);
    private static final String TAG = e.class.getSimpleName();
    private final c creator;
    private final f jobRunner;
    private final d jobinfo;
    private final j threadPriorityHelper;

    /* compiled from: JobRunnable.kt */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.g gVar) {
            this();
        }

        private a() {
        }
    }

    public e(d jobinfo, c creator, f jobRunner, j jVar) {
        kotlin.jvm.internal.l.f(jobinfo, "jobinfo");
        kotlin.jvm.internal.l.f(creator, "creator");
        kotlin.jvm.internal.l.f(jobRunner, "jobRunner");
        this.jobinfo = jobinfo;
        this.creator = creator;
        this.jobRunner = jobRunner;
        this.threadPriorityHelper = jVar;
    }

    @Override // com.vungle.ads.internal.task.h
    public int getPriority() {
        return this.jobinfo.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        j jVar = this.threadPriorityHelper;
        if (jVar != null) {
            try {
                int iMakeAndroidThreadPriority = jVar.makeAndroidThreadPriority(this.jobinfo);
                Process.setThreadPriority(iMakeAndroidThreadPriority);
                k.a aVar = com.vungle.ads.internal.util.k.Companion;
                String TAG2 = TAG;
                kotlin.jvm.internal.l.e(TAG2, "TAG");
                aVar.d(TAG2, "Setting process thread prio = " + iMakeAndroidThreadPriority + " for " + this.jobinfo.getJobTag());
            } catch (Throwable unused) {
                k.a aVar2 = com.vungle.ads.internal.util.k.Companion;
                String TAG3 = TAG;
                kotlin.jvm.internal.l.e(TAG3, "TAG");
                aVar2.e(TAG3, "Error on setting process thread priority");
            }
        }
        try {
            String jobTag = this.jobinfo.getJobTag();
            Bundle extras = this.jobinfo.getExtras();
            k.a aVar3 = com.vungle.ads.internal.util.k.Companion;
            String TAG4 = TAG;
            kotlin.jvm.internal.l.e(TAG4, "TAG");
            aVar3.d(TAG4, "Start job " + jobTag + "Thread " + Thread.currentThread().getName());
            int iOnRunJob = this.creator.create(jobTag).onRunJob(extras, this.jobRunner);
            kotlin.jvm.internal.l.e(TAG4, "TAG");
            aVar3.d(TAG4, "On job finished " + jobTag + " with result " + iOnRunJob);
            if (iOnRunJob == 2) {
                long jMakeNextRescedule = this.jobinfo.makeNextRescedule();
                if (jMakeNextRescedule > 0) {
                    this.jobinfo.setDelay(jMakeNextRescedule);
                    this.jobRunner.execute(this.jobinfo);
                    kotlin.jvm.internal.l.e(TAG4, "TAG");
                    aVar3.d(TAG4, "Rescheduling " + jobTag + " in " + jMakeNextRescedule);
                }
            }
        } catch (Exception e4) {
            k.a aVar4 = com.vungle.ads.internal.util.k.Companion;
            String TAG5 = TAG;
            kotlin.jvm.internal.l.e(TAG5, "TAG");
            aVar4.e(TAG5, "Cannot create job" + e4.getLocalizedMessage());
        }
    }

    public static /* synthetic */ void getPriority$annotations() {
    }
}
