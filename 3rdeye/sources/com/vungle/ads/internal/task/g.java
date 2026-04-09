package com.vungle.ads.internal.task;

/* compiled from: JobRunnerThreadPriorityHelper.kt */
/* loaded from: classes2.dex */
public final class g implements j {
    @Override // com.vungle.ads.internal.task.j
    public int makeAndroidThreadPriority(d jobInfo) {
        kotlin.jvm.internal.l.f(jobInfo, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, jobInfo.getPriority() - 2)) + 10);
    }
}
