package com.vungle.ads.internal.task;

import android.os.Bundle;
import android.os.Process;
import com.vungle.ads.internal.util.p;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class b extends e {

    @NotNull
    public static final a Companion = new a(null);
    private static final String TAG = b.class.getSimpleName();

    @NotNull
    private final com.vungle.ads.internal.task.a creator;

    @NotNull
    private final c jobRunner;

    @NotNull
    private final JobInfo jobinfo;

    @Nullable
    private final f threadPriorityHelper;

    public static final class a {
        public /* synthetic */ a(i iVar) {
            this();
        }

        private a() {
        }
    }

    public b(@NotNull JobInfo jobinfo, @NotNull com.vungle.ads.internal.task.a creator, @NotNull c jobRunner, @Nullable f fVar) {
        p.e(jobinfo, "jobinfo");
        p.e(creator, "creator");
        p.e(jobRunner, "jobRunner");
        this.jobinfo = jobinfo;
        this.creator = creator;
        this.jobRunner = jobRunner;
        this.threadPriorityHelper = fVar;
    }

    public static /* synthetic */ void getPriority$annotations() {
    }

    @Override // com.vungle.ads.internal.task.e
    public int getPriority() {
        return this.jobinfo.getPriority();
    }

    @Override // java.lang.Runnable
    public void run() {
        f fVar = this.threadPriorityHelper;
        if (fVar != null) {
            try {
                int iMakeAndroidThreadPriority = fVar.makeAndroidThreadPriority(this.jobinfo);
                Process.setThreadPriority(iMakeAndroidThreadPriority);
                p.a aVar = com.vungle.ads.internal.util.p.Companion;
                String TAG2 = TAG;
                kotlin.jvm.internal.p.d(TAG2, "TAG");
                aVar.d(TAG2, "Setting process thread prio = " + iMakeAndroidThreadPriority + " for " + this.jobinfo.getJobTag());
            } catch (Throwable unused) {
                p.a aVar2 = com.vungle.ads.internal.util.p.Companion;
                String TAG3 = TAG;
                kotlin.jvm.internal.p.d(TAG3, "TAG");
                aVar2.e(TAG3, "Error on setting process thread priority");
            }
        }
        try {
            String jobTag = this.jobinfo.getJobTag();
            Bundle extras = this.jobinfo.getExtras();
            p.a aVar3 = com.vungle.ads.internal.util.p.Companion;
            String TAG4 = TAG;
            kotlin.jvm.internal.p.d(TAG4, "TAG");
            aVar3.d(TAG4, "Start job " + jobTag + "Thread " + Thread.currentThread().getName());
            int iOnRunJob = this.creator.create(jobTag).onRunJob(extras, this.jobRunner);
            kotlin.jvm.internal.p.d(TAG4, "TAG");
            aVar3.d(TAG4, "On job finished " + jobTag + " with result " + iOnRunJob);
            if (iOnRunJob == 2) {
                long jMakeNextRescedule = this.jobinfo.makeNextRescedule();
                if (jMakeNextRescedule > 0) {
                    this.jobinfo.setDelay(jMakeNextRescedule);
                    this.jobRunner.execute(this.jobinfo);
                    kotlin.jvm.internal.p.d(TAG4, "TAG");
                    aVar3.d(TAG4, "Rescheduling " + jobTag + " in " + jMakeNextRescedule);
                }
            }
        } catch (Exception e10) {
            p.a aVar4 = com.vungle.ads.internal.util.p.Companion;
            String TAG5 = TAG;
            kotlin.jvm.internal.p.d(TAG5, "TAG");
            aVar4.e(TAG5, "Cannot create job" + e10.getLocalizedMessage());
        }
    }
}
