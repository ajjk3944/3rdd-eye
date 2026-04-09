package com.vungle.ads.internal.task;

import kotlin.jvm.internal.p;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public final class d implements f {
    @Override // com.vungle.ads.internal.task.f
    public int makeAndroidThreadPriority(@NotNull JobInfo jobInfo) {
        p.e(jobInfo, "jobInfo");
        return Math.min(19, Math.abs(Math.min(0, jobInfo.getPriority() - 2)) + 10);
    }
}
